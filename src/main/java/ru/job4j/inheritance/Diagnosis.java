package ru.job4j.inheritance;

public class Diagnosis extends Doctor{

    private String diagnosis;

    public Diagnosis(String name, String surname, String education, String birthday, String heal, String diagnosis) {
        super(name, surname, education, birthday, heal);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {return diagnosis;}

    public void setDiagnosis(String diagnosis) {this.diagnosis = diagnosis;}

    public void printInfo() {
        super.printInfo();
        System.out.println("Вот твой диагноз: " + getDiagnosis());
    }
}
