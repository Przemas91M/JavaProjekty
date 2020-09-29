import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void minMaxInput() {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = 0, current, number;
        boolean isAnInt, first = true;
        while (true) {
            System.out.println("Enter number: ");
            isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                current = scanner.nextInt();
                if (first) {
                    first = false;
                    min = current;
                    max = current;
                }

                if (current > max) {
                    max = current;
                } else if (current < min) {
                    min = current;
                }
                scanner.nextLine();
            } else {
                break;
            }
        }
        System.out.println("Min = " + min + " Max = " + max);
        scanner.close();
    }
}
