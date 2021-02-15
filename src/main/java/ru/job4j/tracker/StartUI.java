package ru.job4j.tracker;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class StartUI {

    public static void main(String[] args) {
        Tracker application = new Tracker();
        application.add(new Item(1, "Car"));
        System.out.println(Arrays.toString(application.findByName("Car")));

    }
}
