package ru.job4j.bank;

import java.util.*;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    public void addAccount(String passport, Account account) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                if (!users.containsValue(account)) {
                    users.put(user, Arrays.asList(account));
                }
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                List<Account> accounts = users.get(user);
                for (Account account : accounts) {
                    if (account.getRequisite().equals(requisite)) {
                        return account;
                    }
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        for (User user : users.keySet()) {
            User srcUser = user.getPassport().equals(srcPassport) ? user : null;
            User destUser = user.getPassport().equals(destPassport) ? user : null;
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                Account srcAccount = account.getRequisite().equals(srcRequisite) ? account : null;
                Account destAccount = account.getRequisite().equals(destRequisite) ? account : null;
                if (users.get(destUser).contains(destAccount) && amount <= srcAccount.getBalance()) {
                    srcAccount.setBalance(srcAccount.getBalance() - amount);
                    destAccount.setBalance(destAccount.getBalance() + amount);
                    return true;
                }
            }
        }
        return false;
    }
}
