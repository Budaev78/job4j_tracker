package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book pushkin = new Book("Evgeniy Onegin", 500);
        Book dostoevskiy = new Book("Crime and Punishment", 400);
        Book tolstoy = new Book("War and peace", 1200);
        Book martin = new Book("Clean code", 464);
        Book[] books = new Book[]{pushkin, dostoevskiy, tolstoy, martin};
        for (Book boo : books) {
            System.out.println(boo.getName() + " - " + boo.getCount());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[books.length - 1];
        books[books.length - 1] = temp;
        for (Book boo : books) {
            System.out.println(boo.getName() + " - " + boo.getCount());
        }
        System.out.println();
        for (Book boo : books) {
            if ("Clean code".equals(boo.getName())) {
                System.out.println(boo.getName() + " - " + boo.getCount());
            }

        }

    }
}
