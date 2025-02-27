package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private int code;
    private String name;
    private String description;
    private double basePrice;
    private int taxPercentage;

    // * Constructors

    public Prodotto() {
        this.code = generateRandomProductCode();
        this.name = "";
        this.description = "";
        this.basePrice = 0.0;
        this.taxPercentage = 22;
    }

    public Prodotto(String name, String description, double basePrice) {
        this.code = generateRandomProductCode();
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        this.taxPercentage = 22;
    }

    // * Getters and Setters

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }   

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBasePrice() {
        return String.format("%.2f", this.basePrice);
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getTaxPercentage() {
        return this.taxPercentage;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    // * Utility methods

    public String getFullPrice() {
        return String.format("%.2f", this.basePrice + (this.basePrice * this.taxPercentage / 100));
    }

    public String getFullName(){
        if (this.name != null && this.name.length() > 0) {
            return this.code + "-" + this.name;
        } else {
            return "Prodotto non valido";
        }
    }

    private int generateRandomProductCode() {
        Random random = new Random();
        return random.nextInt(1000);
    }

}