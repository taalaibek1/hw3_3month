package com.example.hw3_3month;

public class Users {

    private String name;
    private int age;
    private int image;

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getAge() {
        return age;
    }



    public Users(String name, int image, int age) {
        this.name = name;
        this.image = image;
        this.age = age;
    }


}
