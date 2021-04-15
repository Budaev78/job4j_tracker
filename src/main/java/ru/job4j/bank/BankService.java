package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковской базы данных
 *
 * @author VLADIMIR BUDAEV
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение базы данных осуществляется в коллекции типа HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход клиента, клиент и коллекция возможных у него счетов
     * добавляются в базу данных
     *
     * @param user клиент, который добавляется в базу данных
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает на вход паспорт и банковский счет, ищет по паспорту клиента
     * и прикрепляет к нему банковский счет
     *
     * @param passport паспорт по которому ищется клиент
     * @param account  банковский счет который прикрепляется к клиенту
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод принимает на вход паспорт и по этому паспорту находится клиент
     *
     * @param passport паспорт по которому ищется клиент
     * @return возвращает клиента у которого этот паспорт
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод принимает на вход паспорт и реквизиты счета, метод находит банковский счет,
     * сначала находим клиента по паспорту, затем проверяем счета у клиента и по реквизитам
     * находим банковский счет, который нужен
     *
     * @param passport  паспорт по которому ищется клиент
     * @param requisite реквизиты по которому ищется счет
     * @return возвращает банковский счет по реквизитам
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst());
    }

    /**
     * Метод принимает на вход паспорта, реквизиты клиентов и сумму денег, переводит сумму денег
     * с одного счета на другой
     *
     * @param srcPassport   паспорт первого клиента
     * @param srcRequisite  реквизиты счета первого клиента
     * @param destPassport  паспорт второго клиента
     * @param destRequisite реквизиты счета второго клиента
     * @param amount        сумма денег
     * @return возвращает true если перевод состоялся, если нет, то возвращает false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (destAccount.isPresent() && srcAccount.isPresent()
                && amount <= srcAccount.get().getBalance()) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            return true;
        }
        return false;
    }
}

