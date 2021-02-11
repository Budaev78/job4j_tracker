package ru.job4j.inheritance;

public class Solution {

    public static void main(String[] args) {
        Diagnosis doc = new Diagnosis("Bob", "Smith", "higher", "31.10.1978", "Diagnostician", "flu");
        doc.printInfo();
        doc.setName("Петр");
        doc.printInfo();
        doc.setHeal("Диагност");
        doc.setDiagnosis("Коронавирус");
        doc.printInfo();
        System.out.println(doc.getBirthday());


    }
}
