import java.util.Scanner;
//wyszukuje najmniejsza wartosc w wektorze
public class ArraysMinimumElement {
    static Scanner scanner = new Scanner(System.in);
    public static int readIntegers(int count){
        int[] readArray = new int[count];
        for(int i = 0; i < readArray.length; i++){
            System.out.println("Enter number #" + (i+1) );
            readArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return findMin(readArray);
    }

    public static int findMin(int[] array){
        int minNumber = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < minNumber){
                minNumber = array[i];
            }
        }
        return minNumber;
    }

}
