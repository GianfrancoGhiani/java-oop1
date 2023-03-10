package org.lessons.java.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //import
        Scanner input = new Scanner(System.in);
        System.out.println("We are creating a bank account for: (insert your name)");
        String accountOwner = input.nextLine();
        Conto account = new Conto(accountOwner);
        System.out.println("Your bank account details are:" + account.toString());
        boolean quit =false;
        do {
            System.out.println("Now do you want to deposit, withdraw or exit? (deposit/withdraw/exit , d/w/e)");
            String action = input.nextLine();
            if(Character.toLowerCase(action.charAt(0)) == 'd'){
                System.out.println("How much do you want to deposit? (€)");
                double incoming = Double.valueOf(input.nextLine());
                account.depositMoney(incoming);
                System.out.println("Now your account balance is: " + account.getAccountBalance());
            } else if (Character.toLowerCase(action.charAt(0)) == 'w') {
                System.out.println("How much do you want to withdraw? (€)");
                double requestMoney = Double.valueOf(input.nextLine());
                if(requestMoney > account.getAccountBalanceValue()){
                    System.out.println("You don't have enough money");
                } else {
                    account.withdrawMoney(requestMoney);
                    System.out.println("Now your account balance is: " + account.getAccountBalance());
                }
            }else {
                quit = true;
            }
        }while (!quit);

    }
}
