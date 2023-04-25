package Utils;

import beans.Student;
import main.Config;

public class StudentUtil {
    public static Student fillStudent() {
        String name = Util.giveText("Enter Name");
        String surName = Util.giveText("Enter Surname");
        int age = Util.giveInt("Enter age");
        String className = Util.giveText("Enter class number");
        double gpa = Util.giveDouble("Enter Gpa");
        Student student = new Student(name, surName, age, className, gpa);
        return student;
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            System.out.println(i + 1 + "." + student.getFullInfo());
        }
    }

    public static void registerStudents() {
        int count = Util.giveInt("How Many students do you want to register?");
        Config.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Register");
            Config.students[i] = fillStudent();
        }
        System.out.println("Registiration is completed successfully");
        printAllRegisteredStudents();
    }

    //Gpa ile duzeldeceyik
    public static void findStudentAndPrint() {
        String text = Util.giveText("Please enter search query");
        Student[] result = findStudent(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullInfo());
        }
    }

    public static void findStudentByGpa() {
        double gpa = Util.giveDouble("Please enter Gpa");
        Student[] result = findStudentByGpa(gpa);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullInfo());
        }
    }

    public static Student[] findStudentByGpa(double gpa) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getRate() == gpa) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getRate() == gpa) {
                result[found] = student;
                found++;
            }
        }
        return result;
    }

    public static Student[] findStudent(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurname().contains(text)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurname().contains(text)) {
                result[found] = student;
                found++;
            }
        }
        return result;
    }

    public static void changeUser() {
        printAllRegisteredStudents();
        int i = Util.giveInt("Which user you want to update?");
        System.out.println("Please enter new Data");
        Student user = fillStudent();
        Config.students[i - 1] = user;
    }

}
