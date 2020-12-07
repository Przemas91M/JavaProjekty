import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Bank Santander = new Bank();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        boolean work = true;
        while (work) {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addDepartment();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    addTransaction();
                    break;
                case 4:
                    printDepartments();
                    break;
                case 5:
                    printCustomers();
                    break;
                case 0:
                    work = false;
                    break;
            }
        }
        scanner.close();
    }

    private static void addCustomer() {
        System.out.println("Enter new customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter department name for new customer: ");
        String department = scanner.nextLine();
        System.out.println("Enter initial transaction value: ");
        double transaction = scanner.nextDouble();
        scanner.nextLine();
        Santander.addNewCustomer(department, name, transaction);
    }

    private static void addTransaction() {
        System.out.println("Enter customers name: ");
        String name = scanner.nextLine();
        System.out.println("Enter department: ");
        String department = scanner.nextLine();
        System.out.println("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        Santander.addTransaction(department, name, amount);
    }

    private static void addDepartment() {
        System.out.println("Enter name of the new Department: ");
        String name = scanner.nextLine();
        Santander.addNewDepartment(name);
    }

    private static void printDepartments() {
        ArrayList<Branch> departments = Santander.departments;
        if (departments.size() == 0) {
            System.out.println("There are no departments yet!");
            return;
        }
        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i).getName());
        }
    }

    private static void printCustomers() {
        System.out.println("Do you want to print also a list of transactions?");
        System.out.println("1 - yes, 0 - no");
        int choice = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Branch> departments = Santander.departments;
        if (departments.size() == 0) {
            System.out.println("There are no departments yet!");
            return;
        }
        for (int i = 0; i < departments.size(); i++) {
            if (choice == 1) {
                Santander.printCustomerList(departments.get(i).getName(), true);
            } else {
                Santander.printCustomerList(departments.get(i).getName(), false);
            }
        }
    }

    private static void printMenu() {
        System.out.println("MENU:");
        System.out.println("1 - add new department");
        System.out.println("2 - add new customer");
        System.out.println("3 - add new transaction");
        System.out.println("4 - print list of departments");
        System.out.println("5 - print list of clients");
        System.out.println("0 - quit");

    }
}
