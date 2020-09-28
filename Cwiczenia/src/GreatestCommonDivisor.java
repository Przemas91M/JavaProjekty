public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int x, int y){
        if(x < 10 || y < 10){
            return -1;
        }
        int gdi = 0;
        if(x > y){
            for (int i = 1; i <= y; i++){
                if(x % i == 0 && y % i == 0){
                    gdi = i;
                }
            }
        }
        else {
            for (int i = 1; i <= x; i++){
                if(x % i == 0 && y % i == 0){
                    gdi = i;
                }
            }
        }
        return gdi;
    }
}
