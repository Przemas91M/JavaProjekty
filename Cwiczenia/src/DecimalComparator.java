public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces( double var1, double var2){
        short liczba1 = (short)(var1 * 1000);
        short liczba2 = (short)(var2 * 1000);
        return liczba1 == liczba2;
    }
}
