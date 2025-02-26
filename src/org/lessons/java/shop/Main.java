package org.lessons.java.shop;

public class Main {
public static void main(String[] args) {
    Prodotto prodotto1 = new Prodotto("Scarpa Instinct VSR", "Scarpette da arrampicata", 130.5);
    Prodotto prodotto2 = new Prodotto("Petzl Quark Martello", "Piccozza da alpinismo tecnico e ghiaccio", 180);

    System.out.println(prodotto1.getFullName());
    System.out.println(String.format("%.2f", prodotto1.getBasePrice()));
    System.out.println(String.format("%.2f", prodotto1.getFullPrice()));

    System.out.println(prodotto2.getFullName());
    System.out.println(String.format("%.2f", prodotto2.getBasePrice()));
    System.out.println(String.format("%.2f", prodotto2.getFullPrice()));
}
}
