package ru.job4j.tracker;

public class DeleteAction implements UserAction{

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter the application number: ");
        if (tracker.delete(id)) {
            System.out.println("The application has been successfully deleted");
        } else {
            System.out.println("Application number not found");
        }
        return true;
    }
}
