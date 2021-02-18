package ru.job4j.tracker;
import java.net.Inet4Address;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] lists = tracker.findAll();
                for (Item list : lists) {
                    System.out.println(list);
                }
            } else if (select == 2) {
                System.out.println("Enter the application number: ");
                int id = scanner.nextInt();
                System.out.println("Enter a new application name: ");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                Item rep = tracker.replace(id, newItem);
                if (rep != null) {
                    System.out.println("The application has been successfully changed");
                } else {
                    System.out.println("Application number not found");
                }
            } else if (select == 3) {
                System.out.println("Enter the application number: ");
                int id = scanner.nextInt();
                tracker.delete(id);
                if (tracker.delete(id)) {
                    System.out.println("The application has been successfully deleted");
                } else {
                    System.out.println("Application number not found");
                }
            } else if (select == 4) {
                System.out.println("Enter the application number: ");
                int id = scanner.nextInt();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Application number not found");
                }
            } else if (select == 5) {
                System.out.println("Enter the name of the request: ");
                String name = scanner.nextLine();
                Item[] itemNames = tracker.findByName(name);
                if (itemNames.length > 0) {
                    for (Item names : itemNames) {
                        System.out.println(names);
                    }
                } else {
                    System.out.println("Applications with this name were not found");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

