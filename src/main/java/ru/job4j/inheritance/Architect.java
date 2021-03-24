package ru.job4j.inheritance;

public class Architect extends Engineer {

    private String drawing;

    public Architect(String name, String surname, String education, String birthday, String build, String drawing) {
        super(name, surname, education, birthday, build);
        this.drawing = drawing;
    }
}
