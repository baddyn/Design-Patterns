package org.example.BuilderDesignPattern;

public class Student {

    private int id;
    private String name;
    private String siblings;
    private String email;
    private String phone;
    private String major;
    private String university;

    public Student(StudentBuilder studentBuilder){
        this.id = studentBuilder.getId();
        this.name = studentBuilder.getName();
        this.siblings = studentBuilder.getSiblings();
        this.email = studentBuilder.getEmail();
        this.phone = studentBuilder.getPhone();
        this.major = studentBuilder.getMajor();
        this.university = studentBuilder.getUniversity();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSiblings() {
        return siblings;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getMajor() {
        return major;
    }

    public String getUniversity() {
        return university;
    }

    public String toString() {
        return this.getId()+ " "+ this.getName() + " " + this.getMajor() +" " + this.getUniversity();
    }

}
