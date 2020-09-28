public class PalindromeNumberChallenge {
    public static boolean isPalindrome(int number){
        int reverse = 0, lastDigit, num = number;
        while (num != 0){
            lastDigit = num % 10;    //wyciagamy liczbe 125 -> 5
            reverse += lastDigit;       //dodajemy do liczby odwórconej
            reverse *= 10;              //zwiekszamy o 10 (5 -> 50)
            num /= 10;               //obcinamy ostatnia liczbe 125 -> 12
        }
        reverse /= 10;
        return reverse == number;
    }
}
