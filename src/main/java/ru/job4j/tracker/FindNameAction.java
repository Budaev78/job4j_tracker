package ru.job4j.tracker;

import java.util.List;

public class FindNameAction implements UserAction {

    private final Output out;

    public FindNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter the name of the request: ");
        List<Item> itemNames = tracker.findByName(name);
        if (itemNames.size() > 0) {
            for (Item names : itemNames) {
                out.println(names);
            }
        } else {
            out.println("Applications with this name were not found");
        }
        return true;
    }
}
