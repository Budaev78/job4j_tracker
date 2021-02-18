package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airbus = new Plain();
        Vehicle sapsan = new Train();
        Vehicle mersedes = new Autobus();
        Vehicle boing = new Plain();
        Vehicle renault = new Autobus();
        Vehicle electrichka = new Train();
        Vehicle[] vehicles = new Vehicle[]{airbus, sapsan, mersedes, boing, renault, electrichka};
        for (Vehicle veh : vehicles) {
            veh.move();
        }
    }

}
