public class BarkingDog {
    //pies szczeka w nocy od 22 do 8 rano, musimy ogarnac, czy mamy wstac.
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking == true && hourOfDay < 8 && hourOfDay >= 0){
            return true;
        } else if (barking == true && hourOfDay > 22 && hourOfDay <=23){
            return true;
        } else {
            return false;
        }
    }
}
