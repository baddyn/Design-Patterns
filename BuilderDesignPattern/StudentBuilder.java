package org.example.BuilderDesignPattern;

public class StudentBuilder {

    private int id;
    private String name;
    private String siblings;
    private String email;
    private String phone;
    private String major;
    private String university;

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

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setSiblings(String siblings) {
        this.siblings = siblings;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public StudentBuilder setMajor(String major) {
        this.major = major;
        return this;
    }

    public StudentBuilder setUniversity(String university) {
        this.university = university;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
