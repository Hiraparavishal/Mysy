package com.example.vishal.mysy;

public class User {
    String erno;
    String name;
    String email;
    String mo;


    public  User()
    {

    }

    public String getErno() {
        return erno;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMo() {
        return mo;
    }

    public User(String erno, String name, String email, String mo) {
        this.erno = erno;
        this.name = name;
        this.email = email;
        this.mo = mo;
    }
}
