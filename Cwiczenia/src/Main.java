/**sprawdzam tutaj cwiczenia**/
public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        boolean wstawaj = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(wstawaj);
        wstawaj = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(wstawaj);
        wstawaj = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(wstawaj);
        wstawaj = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(wstawaj);

        boolean przestepny = LeapYear.isLeapYear(-1600);
        System.out.println(przestepny);
        przestepny = LeapYear.isLeapYear(1600);
        System.out.println(przestepny);
        przestepny = LeapYear.isLeapYear(2017);
        System.out.println(przestepny);
        przestepny = LeapYear.isLeapYear(2000);
        System.out.println(przestepny);

        boolean saRowne = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(saRowne);
        saRowne = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(saRowne);
        saRowne = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(saRowne);
        saRowne = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(saRowne);

        boolean suma = EqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println(suma);
        suma = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println(suma);
        suma = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(suma);

        System.out.println(AreaCalculator.area(5.0d));
        System.out.println(AreaCalculator.area(5,4));
        System.out.println(AreaCalculator.area(-1));

        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(1,1,2);
        IntEqualityPrinter.printEqual(1,2,1);
        IntEqualityPrinter.printEqual(1,2,3);
        IntEqualityPrinter.printEqual(-1,-1,-1);

        suma = PlayingCat.isCatPlaying(true, 10);
        System.out.println(suma);
        suma = PlayingCat.isCatPlaying(false, 36);
        System.out.println(suma);
        suma = PlayingCat.isCatPlaying(false, 35);
        System.out.println(suma);

        DayOfTheWeekChallenge.printDayOfTheWeek(5);
        DayOfTheWeekChallenge.printDayOfTheWeek(7);

        NumberInWord.printNumberInWord(6);
        NumberInWord.printNumberInWord(-4);
        NumberInWord.printNumberInWord(12);

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));

    }
}
