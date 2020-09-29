import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        long average = 0;
        int sum = 0;
        int count = 0;
        while(true){
            //System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                sum += scanner.nextInt();
                count++;
            } else {
                if (count != 0) {
                    average = Math.round((double) sum / count);
                }
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
