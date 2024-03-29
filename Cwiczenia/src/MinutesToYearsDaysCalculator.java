public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid value");
            return;
        }
        long days = minutes / 60; //godziny
        days /= 24; //liczba dni
        long years = days / 365;
        days %= 365;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
