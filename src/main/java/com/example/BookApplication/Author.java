package com.example.BookApplication;

public class Author {
    private String aName;
    private  int age;


    Author(){

    }

    public Author(String aName, int age, int noOfPages) {
        this.aName = aName;
        this.age = age;

    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
