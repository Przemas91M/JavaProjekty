public class LastDigitChecker {
    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            if ((x % 10 == y % 10) || (y % 10 == z % 10) || (x % 10 == z % 10)) {
                return true;
            }
        }
        return false;
    }
}
