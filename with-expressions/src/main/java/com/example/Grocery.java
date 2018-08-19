package com.example;


public class Grocery {

    String name;
    int price;

    public Grocery(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
