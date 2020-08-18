public class TeenNumberChecker {
    public static boolean isTeen(int year){
        return year >= 13 && year <= 19;
    }
    public static boolean hasTeen(int year1, int year2, int year3){
        return isTeen(year1) || isTeen(year2) || isTeen(year3);
    }
}
