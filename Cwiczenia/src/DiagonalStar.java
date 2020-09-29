//Funkcja w klasie rysujaca gwiazde
public class DiagonalStar {
    public static void printDiagonalStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        int column = 0, row = 0;
        for(row = 0; row < number; row++){
            for(column = 0; column < number; column++){      //iteruje poszczegolne pozycje w linii
                if(column == 0 || row == 0 || column == (number -1) || row == (number -1)){
                    System.out.print("*");
                }
                else if(column == row){
                    System.out.print("*");
                }
                else if(column == (number - row - 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
