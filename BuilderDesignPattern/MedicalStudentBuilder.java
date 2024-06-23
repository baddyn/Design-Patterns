package org.example.BuilderDesignPattern;

public class MedicalStudentBuilder extends StudentBuilder{
    public Student build() {
        return new MedicalStudent(this);
    }
}
