package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String build;

    public Engineer(String name, String surname, String education, String birthday, String build) {
        super(name, surname, education, birthday);
        this.build = build;
    }

    public String getBuild() {
        return build;
    }
}
