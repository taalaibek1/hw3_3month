package com.example.hw3_3month;

public class Movies {
    private String name;
    private int iamge;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIamge() {
        return iamge;
    }

    public void setIamge(int iamge) {
        this.iamge = iamge;
    }



    public Movies(String name, int iamge) {
        this.name = name;
        this.iamge = iamge;
    }


}
