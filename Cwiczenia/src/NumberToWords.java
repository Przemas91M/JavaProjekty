public class NumberToWords {
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        else if(number == 0)
        {
            return 1;
        }
        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
    }
    public static int reverse(int number){
        int sum = 0;
        while(number != 0) {
            sum += number % 10;
            sum *= 10;
            number /= 10;
        }
        sum /= 10;
        return sum;
    }
    public static void numberToWords(int number){
        int count = getDigitCount(number);
        if(count == -1){
            System.out.println("Invalid Value");
            return;
        }
        int reversedNumber = reverse(number);
        for (int i = 0; i < count; i++) {
            int digit = reversedNumber % 10;
            reversedNumber /= 10;
            switch(digit){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }
        System.out.println("");
    }
}
