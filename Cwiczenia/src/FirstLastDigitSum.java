public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0){
            return -1;
        }
        int lastDigit, firstDigit = 0;
        lastDigit = number % 10; //ostatnia cyfra
        while(number != 0){
            firstDigit = number;
            number /= 10;
        }
        return lastDigit + firstDigit;
    }
}
