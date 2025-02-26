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

public String getBasePrice() {
    return String.format("%.2f", this.basePrice);
}

public String getFullPrice() {
    return String.format("%.2f", this.basePrice + (this.basePrice * this.taxPercentage / 100));
}

public String getFullName(){
    return this.code + "-" + this.name;
}

}

