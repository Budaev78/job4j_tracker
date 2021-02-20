package ru.job4j.tracker;

public class ShowAllAction implements UserAction{

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item [] lists = tracker.findAll();
        for (Item list : lists) {
            System.out.println(list);
        }
        return true;
    }
}
