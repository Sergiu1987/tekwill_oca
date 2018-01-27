package class_practice.lectii_frecventa.impl;

public class Student extends Staff{

    public Student(String text) {
        super(text);
    }

    @Override
    public String getRoleName() {
        return "Student";
    }
}
