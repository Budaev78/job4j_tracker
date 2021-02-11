package ru.job4j.inheritance;

public class Ophthalmologist extends Doctor{

    private String vision;

    public Ophthalmologist(String name, String surname, String education, String birthday, String heal, String vision) {
        super(name, surname, education, birthday, heal);
        this.vision = vision;
    }
}
