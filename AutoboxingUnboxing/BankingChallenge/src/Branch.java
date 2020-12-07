import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private int searchByCustomerName(String name){
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public void addCustomer(String name, double amount){
        int index = searchByCustomerName(name);
        if(index < 0){ //-1 oznacza, ze nie znalazłem takiego klienta, wiec moge dodac nowego
            this.customers.add(new Customer(name, amount));
            System.out.println("Customer " + name + " added successfully");
            return;
        }
        System.out.println("Customer already exists!");

    }

    public void addNewTransaction(String customerName, double amount){
        int index = searchByCustomerName(customerName);
        if(index < 0){
            System.out.println("Customer not found!");
            return;
        }
        this.customers.get(index).addTransaction(amount);
        System.out.println("Added transaction for " + amount+ " to customer " + customerName);
    }
}
