package beans;

public class Teacher extends Person {
    private Student[] students;
    private String email;
    private String password;

    public Teacher(Student[] students, String email, String password) {
        this.students = students;
        this.email = email;
        this.password = password;
    }

    public Teacher(String name, String surname, int age, Student[] students, String email, String password) {
        super(name, surname, age);
        this.students = students;
        this.email = email;
        this.password = password;
    }

    public Teacher() {
    }

    public Teacher(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
