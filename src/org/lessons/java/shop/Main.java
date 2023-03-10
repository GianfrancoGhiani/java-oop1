package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prodotto product = CreateProduct();
        System.out.println(product.toString());
        product.setPrice(12.00);
        System.out.println(product.toString());


    }
    public static Prodotto CreateProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to create a product? (yes/no, y/n)" );
        String creation = input.nextLine();
        Prodotto product;
        if (Character.toLowerCase(creation.charAt(0)) == 'y'){
            System.out.println("Product name:");
            String name = input.nextLine();
            System.out.println("Product description:");
            String descr = input.nextLine();
            System.out.println("Product base price:");
            double price = Double.parseDouble(input.nextLine());
            System.out.println("Product IVA:");
            double iva = Double.parseDouble(input.nextLine());
            product = new Prodotto(name,descr,price,iva);
        } else {
            System.out.println("ok, so i did it to you:");
            product = new Prodotto();
        }

        return product;
    }
}
