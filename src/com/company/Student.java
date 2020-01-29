package com.company;

public class Student {
    public String username;
    public String completename;
    public String Address;
    public String pass;
    public String education;
    public String age;
    public String number;

    public Student(StudentBuilder builder){
        this.username=builder.username;
        this.completename=builder.completename;
        this.Address=builder.Address;
        this.pass=builder.pass;
        this.education=builder.education;
        this.age=builder.age;
        this.number=builder.number;

    }

    public String getusername() {
        return username;
    }

    public String getcompletename() {
        return completename;
    }

    public String getAddress() {
        return Address;
    }

    public String getpass() {
        return pass;
    }

    public String geteducation() {
        return education;
    }

    public String getage() {
        return age;
    }
    public String getNumber() {
        return number;
    }
}
