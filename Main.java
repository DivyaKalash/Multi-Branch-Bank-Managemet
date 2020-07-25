package com.TheK;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Indian Bank");

        if(bank.addBranch("Patna")) {
            System.out.println("Patna branch created");
        }

        bank.addCustomer("Patna", "Kalash", 50.05);
        bank.addCustomer("Patna", "Keshav", 175.34);
        bank.addCustomer("Patna", "Priya", 220.12);

        bank.addBranch("Bangalore");
        bank.addCustomer("Bangalore", "Abhishek", 150.54);

        bank.addCustomerTransaction("Patna", "Kalash", 44.22);
        bank.addCustomerTransaction("Patna", "Kalash", 12.44);
        bank.addCustomerTransaction("Patna", "Keshav", 1.65);

        bank.listCustomer("Patna", true);
        bank.listCustomer("Bangalore", true);

        bank.addBranch("Delhi");

        if(!bank.addCustomer("Delhi", "Aman", 5.53)) {
            System.out.println("Error Delhi branch does not exist");
        }

        if(!bank.addBranch("Patna")) {
            System.out.println("Patna branch already exists");
        }

        if(!bank.addCustomerTransaction("Patna", "Deepak", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Patna", "Kalash", 12.21)) {
            System.out.println("Customer Kalash  already exists");
        }

    }
}
