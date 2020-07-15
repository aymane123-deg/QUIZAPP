package com.example.firstapp;

public class User {
    String name;
    String email;
    String pswd;

    public User(String name, String email, String pswd) {
        this.name = name;
        this.email = email;
        this.pswd = pswd;
    }
    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}
