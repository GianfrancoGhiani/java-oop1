package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prod1 = new Prodotto("prod","descr",12.32,23);
        System.out.println(prod1.getBasePrice());
        System.out.println(prod1.getFinalPrice());
        System.out.println(prod1.getCode());
        System.out.println(prod1.getDescription());
        System.out.println(prod1.getName());
        System.out.println(prod1.getProductCodeName());
        System.out.println(prod1.getIva());
    }
}
