package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(50);
        System.out.println("first : " + first.load + ". second : " + second.load);
        second.exchange(first);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }
}
