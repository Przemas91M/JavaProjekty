public class DigitSumChallenge {
    public static int sumDigits(int number){
        if(number < 10 ){
            return -1;
        }
        int sum = 0, digit;
        while (number != 0) {
            digit = number % 10; // to da nam pierwszą liczbę 125 -> 5
            sum += digit;
            number /= 10; //w ten sposob usuniemy 5 (125 -> 12)
        }
        return sum;
    }
}
