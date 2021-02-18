package ru.job4j.tracker;
import java.net.Inet4Address;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showItem(Tracker tracker) {
        Item [] lists = tracker.findAll();
        for (Item list : lists) {
            System.out.println(list);
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter the application number: "));
        String name = input.askStr("Enter a new application name: ");
        Item newItem = new Item(name);
        Item rep = tracker.replace(id, newItem);
        if (rep != null) {
            System.out.println("The application has been successfully changed");
        } else {
            System.out.println("Application number not found");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter the application number: "));
        tracker.delete(id);
        if (tracker.delete(id)) {
            System.out.println("The application has been successfully deleted");
        } else {
            System.out.println("Application number not found");
        }
    }

    public static void findIdItem(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter the application number: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Application number not found");
        }
    }

    public static void findNameItem(Input input, Tracker tracker) {
        String name = input.askStr("Enter the name of the request: ");
        Item[] itemNames = tracker.findByName(name);
        if (itemNames.length > 0) {
            for (Item names : itemNames) {
                System.out.println(names);
            }
        } else {
            System.out.println("Applications with this name were not found");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findNameItem(input, tracker);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}

