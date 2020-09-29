package com.company;

public class VipAccount {
    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipAccount(){
        this("Default name", 0.0, "Default email");
    }
    public VipAccount(String customerName, double creditLimit){
        this(customerName, creditLimit, "Default emailAdress");
    }
    public VipAccount(String customerName, double creditLimit, String emailAddress){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
