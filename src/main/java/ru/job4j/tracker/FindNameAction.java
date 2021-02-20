package ru.job4j.tracker;

public class FindNameAction implements UserAction{

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter the name of the request: ");
        Item[] itemNames = tracker.findByName(name);
        if (itemNames.length > 0) {
            for (Item names : itemNames) {
                System.out.println(names);
            }
        } else {
            System.out.println("Applications with this name were not found");
        }
        return true;
    }
}
