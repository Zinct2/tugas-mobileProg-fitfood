package com.chris.myapplication;

public class Product {
    private String name;
    private int price;
    private int image;

    public Product(String name, int price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return image;
    }

    public void setStock(int stock) {
        this.image = stock;
    }
}
