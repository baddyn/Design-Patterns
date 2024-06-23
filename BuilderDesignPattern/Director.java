package org.example.BuilderDesignPattern;

public class Director {
    String enggMajor = "eng", medicalMajor = "med", enggUniversity = "IIT", medicalUniversity ="AIIMS";

    public void constructStudent(StudentBuilder studentBuilder){
        switch(studentBuilder.getClass().getSimpleName()){
            case "EnggStudentBuilder":
                studentBuilder.setMajor(enggMajor);
                studentBuilder.setUniversity(enggUniversity);
                break;
            case "MedicalStudentBuilder":
                studentBuilder.setMajor(medicalMajor);
                studentBuilder.setUniversity(medicalUniversity);
                break;
        }
    }
}
