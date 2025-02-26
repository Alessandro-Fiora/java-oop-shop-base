package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

public int code;
public String name;
public String description;
public double basePrice;
public int taxPercentage;

public Prodotto(String name, String description, double basePrice) {

    Random random = new Random();
    this.code = random.nextInt(1000);

    this.name = name;
    this.description = description;
    this.basePrice = basePrice;

    this.taxPercentage = 22;
}

public double getBasePrice() {
    return this.basePrice;
}

public double getFullPrice() {
    return this.basePrice + (this.basePrice * this.taxPercentage / 100);
}

}

