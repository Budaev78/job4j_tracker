package ru.job4j.tracker;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item car = new Item();
        car.setName("Car");
        tracker.add(car);
        System.out.println(car.toString());

    }
}
