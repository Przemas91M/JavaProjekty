import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        //loadObject(tim);
        System.out.println(tim);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Monster strength = " +((Monster) werewolf).getStrength()); //trzeba wykorzystać rzutowanie, by odczytać dane z interfejsu
        saveObject(werewolf);
        System.out.println(werewolf);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Menu:\n" +
                "1 - enter a string\n" +
                "2 - quit");

        while(!quit){
            System.out.println("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string:");
                    String input = scanner.nextLine();
                    values.add(index, input);
                    index++;
                    break;
            }
        }
        return values;
    }
    
    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
