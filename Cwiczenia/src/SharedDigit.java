public class SharedDigit {
    public static boolean hasSharedDigit(int var1, int var2) {
        while ((var1 >= 10 && var1 <= 99) && (var2 >= 10 && var2 <= 99)) {
            if ((var1 % 10 == var2 % 10) || (var1 / 10 == var2 / 10) || (var1 % 10 == var2 / 10)) {
                return true;
            }
            var1 /= 10;
        }
        return false;
    }
}
