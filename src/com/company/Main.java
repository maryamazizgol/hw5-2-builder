package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String username=scanner.next();
        String completename=scanner.next();
        String Address=scanner.next();
        String pass=scanner.next();
        String education=scanner.next();
        String age=scanner.next();
        String number=scanner.next();

        Student StudentBuilder = new StudentBuilder().
                setusername(username).setcompletename(completename).
                setAdress(Address).setpass(pass).
                seteducation(education).setage(age).
                setnumber(number).builder();

        System.out.println("username : " + StudentBuilder.getusername());
        System.out.println("completename : " + StudentBuilder.getcompletename());
        System.out.println("address : " + StudentBuilder.getAddress());
        System.out.println("pass : " + StudentBuilder.getpass());
        System.out.println("education : " + StudentBuilder.geteducation());
        System.out.println("age : " + StudentBuilder.getage());
        System.out.println("number : " + StudentBuilder.getNumber());

    }






    }
