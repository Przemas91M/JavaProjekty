import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public ArrayList<Contacts> getContacts() {
        return contacts;
    }

    public void addContact(String name, String number){
        int index = searchByName(name);
        if(index < 0){ //jezeli nie ma takiego kontaktu w bazie
            contacts.add(new Contacts(number, name));
        } else {
            System.out.println("Contact already exists!");
        }
    }

    public void removeContact(String name){
        int index = searchByName(name);
        if(index < 0){
            System.out.println("Contact doesn't exist!");
            return;
        }
        contacts.remove(index);
        System.out.println("Removed contact!");
    }

    public void modifyContactName(String name, String newName){
        int index = searchByName(name);
        if(index >= 0){
            modifyContactName(newName, index);
        }
        else {
            System.out.println("Contact doesn't exist!");
            return;
        }
    }
    private void modifyContactName(String name, int index){
        contacts.get(index).setName(name);
    }

    public void modifyContactNumber(String name, String newNumber){
        int index = searchByName(name);
        if(index >= 0){
            modifyContactNumber(index, newNumber);
        }
        else {
            System.out.println("Contact doesn't exist!");
            return;
        }

    }

    private void modifyContactNumber(int index, String newNumber){
        contacts.get(index).setPhoneNumber(newNumber);
    }

    public int searchByName(String name){
        int index = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if(name.equals(contacts.get(i).getName())){
                index = i;
            }
        }
        return index;
    }

    public int searchByNumber(String number){
        int index = -1;
        for (int i = 0; i < contacts.size(); i++) {
            if(number.equals(contacts.get(i).getPhoneNumber())){
                index = i;
            }
        }
        return index;
    }

    public void printContact(int index){
        if(index < 0){
            System.out.println("Contact doesn't exist!");
            return;
        }
        System.out.println("Found contact:");
        System.out.println(contacts.get(index).getName());
        System.out.println(contacts.get(index).getPhoneNumber());
    }


}
