package beans;

public class Student extends Person {
    private String className;
    private double gpa;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getRate() {
        return gpa;
    }

    public void setRate(double rate) {
        this.gpa = rate;
    }

    public Student(String className, double rate) {
        this.className = className;
        this.gpa = rate;
    }

    public Student(String name, String surname, int age, String className, double gpa) {
        super(name, surname, age);
        this.className = className;
        this.gpa = gpa;
    }

    public String getFullInfo() {
        return super.getName() + super.getSurname() + super.getAge() + this.className + this.gpa;
    }
}
