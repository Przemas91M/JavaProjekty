import java.sql.SQLOutput;
import java.util.ArrayList;

//BANK class
public class Bank {
    ArrayList<Branch> departments;

    public Bank(){
    this.departments = new ArrayList<>();
    }

    public void addNewDepartment(String name){
        int index = searchForDepartment(name);
        if(index < 0) {
            this.departments.add(new Branch(name));
            System.out.println("Added new department: " + name);
            return;
        }
        System.out.println("Department already exist!");

    }

    public void addNewCustomer(String department, String customerName, double initialTransaction){
        int index = searchForDepartment(department);
        if(index < 0 ){
            System.out.println("That department doesn't exist!");
            return;
        }
        departments.get(index).addCustomer(customerName, initialTransaction);
    }

    public void addTransaction(String department, String customerName, double amount){
        int index = searchForDepartment(department);
        if(index < 0 ){
            System.out.println("That department doesn't exist!");
            return;
        }
        departments.get(index).addNewTransaction(customerName, amount);
    }

    public void printCustomerList(String department, boolean printTransactions){
        ArrayList<Customer> customers;
        int index = searchForDepartment(department);
        if(index < 0 ){
            System.out.println("That department doesn't exist!");
            return;
        }
        customers = departments.get(index).getCustomers();
        System.out.println("List of customers from " + department + " :");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).getName());
            if(printTransactions){
                System.out.println("List of transactions from the customer: ");
                ArrayList<Double> transactions = customers.get(i).getTransactions();
                for(int j = 0; j<transactions.size(); j++){
                    System.out.println("[ " + i + " ] Amount: " + transactions.get(i));
                }
            }
        }
    }

    private int searchForDepartment(String name){
        for (int i = 0; i < departments.size(); i++) {
            String departmentName = departments.get(i).getName();
            if(departmentName.equals(name)){
                return i;
            }
        }
        return -1;
    }


}
