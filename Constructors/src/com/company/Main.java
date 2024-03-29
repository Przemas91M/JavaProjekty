package com.company;

public class Main {

    public static void main(String[] args) {
	BankAccount account = new BankAccount("554328193018", 105.56,
            "Przemek","kocham.czonek@gmal.com","605543201");
	BankAccount defaultAccount = new BankAccount();
        System.out.println(defaultAccount.getAccountNumber());
        System.out.println(defaultAccount.getBalance());
        System.out.println(defaultAccount.getCustomerName());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getCustomerName());
        account.withdrawFunds(10);
        account.withdrawFunds(60);
        VipAccount defaultVipAccount = new VipAccount();
        System.out.println(defaultVipAccount.getCustomerName());
        System.out.println(defaultVipAccount.getCreditLimit());
        System.out.println(defaultVipAccount.getEmailAddress());
        VipAccount setVipAccount = new VipAccount("Przemo", 10000, "przemo@gmail.com");
        System.out.println(setVipAccount.getCustomerName());
        System.out.println(setVipAccount.getCreditLimit());
        System.out.println(setVipAccount.getEmailAddress());
        Wall wall = new Wall(1.125, -1.0);

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

}
