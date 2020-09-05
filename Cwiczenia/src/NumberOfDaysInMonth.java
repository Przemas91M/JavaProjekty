public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        boolean isLeapYear = isLeapYear(year);
        int returnValue;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                returnValue =  31;
            break;
            case 2:
                if (isLeapYear) {
                    returnValue = 29;
                } else {
                    returnValue = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                returnValue = 30;
                break;
            default:
                returnValue = -1;
                break;
        }
        return returnValue;
    }
}
