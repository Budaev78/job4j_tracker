package ru.job4j.inheritance;

public class Solution {

    public static void main(String[] args) {
        Patient ivan = new Patient();
        Doctor doc = new Doctor("Алексей", "Иванов", "Высшее", "31.10.1980", "Терапевт");
        System.out.println(doc.heal(ivan));
    }
}
