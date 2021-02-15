package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Владимир Будаев");
        student.setGroup("654 группа");
        student.setDate("01.02.2021г.");
        System.out.println("Студент " + student.getName() + " из " + student.getGroup() + " поступил на курсы "
                + student.getDate());
    }
}
