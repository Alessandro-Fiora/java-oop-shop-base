package org.lessons.java.shop;

public class Main {
public static void main(String[] args) {
    Prodotto scarpette = new Prodotto("Scarpa Instinct VSR", "Scarpette da arrampicata", 130.5);
    Prodotto piccozza = new Prodotto("Petzl Quark Martello", "Piccozza da alpinismo tecnico e ghiaccio", 180);
    Prodotto prodottoVuoto = new Prodotto();

    System.out.println(scarpette.getFullName());
    scarpette.setName("Scarpa Drago");
    System.out.println(scarpette.getFullName());
    System.out.println(scarpette.getBasePrice());
    System.out.println(scarpette.getFullPrice());
    

    System.out.println(prodottoVuoto.getFullName());
    System.out.println(prodottoVuoto.getBasePrice());
    System.out.println(prodottoVuoto.getFullPrice());
}
}
