package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    // imports
    Random rand = new Random();
    DecimalFormat decPrice = new DecimalFormat("#.00");
    DecimalFormat codePattern = new DecimalFormat("00000000.");
    // variables
    private int code ;
    private String name;
    private String description;
    private double price;
    private double iva;
    // constructors
    public Prodotto(){
        code= rand.nextInt(0,1000000);
        name = "Product";
        description = "Description not available";
        price = 0;
        iva = 22;
    }
    public Prodotto(String name, String description, double price, double iva) {
        code= rand.nextInt(0,1000000);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        if (price>0){
            this.price = price;
        }
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        if ((iva>0) && (iva!=(double)22)){
            this.iva = iva;
        }
    }
    //returns base price not including IVA
    public String getBasePrice() {
        return decPrice.format(price);
    }
    //returns price including IVA
    public String getFinalPrice() {
        return decPrice.format(price + ((price / 100) * iva));
    }

    //returns code-name of the product
    public String getProductCodeName(){
        return code +"-"+ name;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "code=" + codePattern.format(code) +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                ", final price=" + (price + ((price /100)*iva)) +
                ", code-name=" + (codePattern.format(code) +"-"+name) +
                '}';
    }
}
