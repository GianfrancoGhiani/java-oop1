package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Conto {
    // imports
    Random rand = new Random();
    DecimalFormat dec = new DecimalFormat("#.00");
    // variables
    private int accountNumber;
    private String accountOwner;
    private String accountBalance;

    // constructor
    public Conto(){
        accountBalance = "0€";
        accountNumber = rand.nextInt(1,1000);
        accountOwner="Name Surname";
    }
    public Conto(String accountOwner){
        accountBalance = "0€";
        accountNumber = rand.nextInt(1,1000);
        this.accountOwner = accountOwner;
    }

    //getter and setter

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }
    // methods
    public void depositMoney(double incomingMoney){
        double tempBalance = Double.valueOf(accountBalance.substring(0, accountBalance.length() - 1));
        accountBalance = (tempBalance + incomingMoney) + "€";
    }
    public void withdrawMoney(double requestMoney){
        double tempBalance = Double.valueOf(accountBalance.substring(0, accountBalance.length() - 1));
        if ((tempBalance - requestMoney)>=0){
            accountBalance = (tempBalance - requestMoney) + "€";
        }
    }
    public double getAccountBalanceValue(){
        return Double.valueOf(accountBalance.substring(0, accountBalance.length() - 1));
    }

    @Override
    public String toString() {
        return
                "accountNumber=" + accountNumber +
                ", accountOwner='" + accountOwner + '\'' +
                ", accountBalance='" + accountBalance + '\''
                ;
    }
}
