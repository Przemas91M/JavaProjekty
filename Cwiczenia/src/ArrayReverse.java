import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    private static Scanner scanner = new Scanner(System.in);
    public static void readInteger(int count){
        int[] readArray = new int[count];
        for(int i = 0; i < readArray.length; i++){
            System.out.println("Enter number #" + (i+1) );
            readArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        reverse(readArray);
    }

    private static void reverse(int[] array){
        int[] reversedArray = new int[array.length];
        int j = array.length - 1;
        for(int i = 0; i < array.length; i++){
            reversedArray[i] = array[j];
            j--;
        }

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }

}
