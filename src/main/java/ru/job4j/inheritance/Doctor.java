package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String heal;

    public Doctor(String name, String surname, String education, String birthday, String heal) {
        super(name, surname, education, birthday);
        this.heal = heal;
    }

    public String getHeal() {
        return heal;
    }

    public void setHeal(String heal) {
        this.heal = heal;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Я доктор " + getHeal());
    }

    public Diagnosis heal(Patient patient) {
        return new Diagnosis();
    }
}
