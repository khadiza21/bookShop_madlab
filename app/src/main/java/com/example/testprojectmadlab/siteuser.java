package com.example.testprojectmadlab;

public class siteuser {

    private  String name, age, number, email, gender;

    public siteuser() {
    }


    public siteuser(String name, String age, String number, String email, String gender) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
