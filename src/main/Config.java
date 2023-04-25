package main;

import beans.Student;
import beans.Teacher;

public class Config {
    public static Student[] students = null;
    public static Teacher teacher = new Teacher("Ulvi", "Suleymanov",
            27, students, "ulvi@gmail.com", "12345");
}
