package org.example.BuilderDesignPattern;

public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        StudentBuilder enggStudentBuilder =  new EnggStudentBuilder().setId(1).setName("ram").setEmail("ram@gmail.com");
        StudentBuilder medicalStudentBuilder =  new MedicalStudentBuilder().setId(1).setName("shyam");

        director.constructStudent(enggStudentBuilder);
        EnggStudent enggStudent = (EnggStudent) enggStudentBuilder.build();

        director.constructStudent(medicalStudentBuilder);
        MedicalStudent medicalStudent = (MedicalStudent) medicalStudentBuilder.build();

        System.out.println(enggStudent.toString());
        System.out.println(medicalStudent.toString());
    }
}
