import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void readUserInput(){
        int counter = 1, sum = 0;
        boolean hasNextInt;
        Scanner scanner = new Scanner(System.in);
        while (counter < 11){
            System.out.println("Enter number #" + counter + ": ");
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt)
            {
                sum += scanner.nextInt();
                counter++;
            }
            else{
                System.out.println("Invalid value");
            }
            scanner.nextLine();

        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
