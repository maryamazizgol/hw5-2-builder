package com.company;

public class StudentBuilder {

    public String username;
    public String completename;
    public String Address;
    public String pass;
    public String education;
    public String age;
    public String number;


    public StudentBuilder setusername(String username) {
        this.username = username;
        return this;
    }

    public StudentBuilder setcompletename (String completename) {
        this.completename = completename;
        return this;
    }

    public StudentBuilder setAdress(String Address) {
        this.Address = Address;
        return this;
    }

    public StudentBuilder setpass(String pass) {
        this.pass = pass;
        return this;
    }

    public StudentBuilder seteducation(String education) {
        this.education = education;
        return this;
    }

    public StudentBuilder setage(String age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setnumber(String number) {
        this.number = number;
        return this;
    }

    public Student builder() {

        return new Student(this);
    }
}
