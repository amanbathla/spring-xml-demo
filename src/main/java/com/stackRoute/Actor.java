package com.stackRoute;

public class Actor {

    //Declaration


    String name;
    String Gender;
    int age;


    //Constructor

    Actor(){
    }
    Actor(String name,String gender,int age){
        this.name = name;
        this.Gender = gender;
        this.age = age;
    }

    //Setter

    public void setName(String name) {
        this.name = name;
    }


    public void setGender(String gender) {
        this.Gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // To String Method


    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", age=" + age +
                '}';
    }

}
