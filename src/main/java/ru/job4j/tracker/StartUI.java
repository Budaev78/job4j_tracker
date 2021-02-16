package ru.job4j.tracker;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class StartUI {

    public static void main(String[] args) {
        Tracker application = new Tracker();
        Item car = new Item();
        car.setName("Car");
        application.add(car);
        System.out.println(Arrays.toString(application.findByName("Car")));

    }
}
