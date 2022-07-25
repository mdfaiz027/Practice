package com.example.practice;

public class Model {
    String main, sub;
    int image;

    public Model(String main, String sub, int image) {
        this.main = main;
        this.sub = sub;
        this.image = image;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}

