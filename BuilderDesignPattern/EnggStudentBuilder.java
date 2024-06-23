package org.example.BuilderDesignPattern;

public class EnggStudentBuilder extends StudentBuilder{
    public Student build() {
        return new EnggStudent(this);
    }
}
