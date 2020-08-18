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
    }
}
