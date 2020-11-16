import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        while (!quit) {

            System.out.println("MENU\nEnter your choice: ");
            System.out.println("1 - add new contact");
            System.out.println("2 - edit your contacts");
            System.out.println("3 - remove contact");
            System.out.println("4 - search for contact");
            System.out.println("5 - display all your contacts");
            System.out.println("6 - turn off your phone");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    editContacts();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    searchContacts();
                    break;
                case 5:
                    printContacts();
                    break;
                case 6:
                    quit = true;
                    break;

            }

        }
    }

    private static void addNewContact() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();
        phone.addContact(name, number);
    }

    private static void editContacts() {
        System.out.println("1 - edit name\n2 - edit number");
        int choice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name of the contact you want to modify: ");
        String name = scanner.nextLine();
        if (choice == 1) {
            System.out.println("Enter new name: ");
            String newName = scanner.nextLine();
            phone.modifyContactName(name, newName);
        } else if (choice == 2) {
            System.out.println("Enter new number: ");
            String newNumber = scanner.nextLine();
            phone.modifyContactNumber(name, newNumber);
        }
    }

    private static void searchContacts() {
        System.out.println("1 - search by name\n2 - search by number");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            System.out.println("Enter search name: ");
            String name = scanner.nextLine();
            choice = phone.searchByName(name);
            phone.printContact(choice);
        } else if (choice == 2) {
            System.out.println("Enter the number you are looking for: ");
            String number = scanner.nextLine();
            choice = phone.searchByNumber(number);
            phone.printContact(choice);
        }
    }

    private static void printContacts() {
        ArrayList<Contacts> contacts = new ArrayList<Contacts>(phone.getContacts()); //przepisuje liste z telefonu
        if (contacts.isEmpty()) {
            System.out.println("You don't have any contacts yet!");
            return;
        }
        System.out.println("Your contact list:");
        for (Contacts contacts1 : contacts) {
            System.out.println(contacts1);
        }
    }

    private static void removeContact(){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        phone.removeContact(name);

    }


}
