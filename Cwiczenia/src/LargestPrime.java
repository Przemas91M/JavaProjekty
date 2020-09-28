public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number < 1){
            return -1;
        }
        int count = 0, prime = 0;
        for (int i = 2; i <= number; i++) {
            if(number % i == 0) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
            }
            if(count == 2)
            {
                prime = i;
            }
            count = 0;
        }
        return prime;
    }
}
