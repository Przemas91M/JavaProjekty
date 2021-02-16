import java.util.Scanner;

public class Main {

    private static Player winamp = new Player();
    public static void main(String[] args) {
        play();

    }

    public static void play(){
        Scanner scanner = new Scanner(System.in);


        boolean start = true;
        while(start){
            System.out.println("MENU:");
            System.out.println("1 - add song to playlist");
            System.out.println("2 - remove current song from playlist");
            System.out.println("3 - replay song");
            System.out.println("4 - play previous song");
            System.out.println("5 - play next song");
            System.out.println("6 - quit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter name of the song: ");
                    String title = scanner.nextLine();
                    winamp.addSongToPlaylist(title);
                    break;
                case 2:
                    winamp.removeCurrentSong();
                    break;
                case 3:
                    winamp.play();
                    break;
                case 4:
                    winamp.playPreviousSong();
                    break;
                case 5:
                    winamp.playNextSong();
                    break;
                case 6:
                    start = false;
                    System.out.println("Thank you for choosing winamp!");
                    break;
            }
        }

    }
}
