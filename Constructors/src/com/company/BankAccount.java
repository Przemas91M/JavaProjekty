package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){   //pusty konstruktor - tworze obiekt z domyslnymi wartosciami (odwoluje sie do konstruktora ponizej)
        this("000000", 0.0, "Default customerName","Default email",
                "Default phoneNumber");
    }
    public BankAccount(String accountNumber, double balance,String customerName, String email, String phoneNumber){
    this.accountNumber = accountNumber; //lepiej robic w ten sposob niz wywolac setNumber()
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
        System.out.println("Account created!");
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String number){
        this.accountNumber = number;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("Deposited " + amount+ ". Current balance is: " + this.balance);
    }

    public void withdrawFunds(double amount){
        if(this.balance - amount < 0){
            System.out.println("Can't wtihdraw this amount of money.");
            return;
        }
        this.balance -= amount;
        System.out.println("Withdrawal of "+ amount + " success. Current balance is: " + this.balance);
    }
}
