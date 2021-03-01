package ru.job4j.tracker;

public class ReplaceAction implements UserAction{

    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter the application number: ");
        String name = input.askStr("Enter a new application name: ");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            out.println("The application has been successfully changed");
        } else {
            out.println("Application number not found");
        }
        return true;
    }
}
