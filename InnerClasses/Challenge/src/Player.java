import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Player {
    private ArrayList<Album> collection = new ArrayList<>();
    private LinkedList<Song> playlist = new LinkedList<>();
    private ListIterator<Song> iterator;
    private Song currentSong;
    private boolean goingForward = true;
    private boolean isPlaying = false;

    public Player() {
        Album netrunner = new Album("Netrunner");
        netrunner.addSong(new Song("Running", "V", 3.45));
        netrunner.addSong(new Song("Hackerman", "V", 4.15));
        netrunner.addSong(new Song("Firewall", "V", 2.35));
        Album viskoza = new Album("Viskoza");
        viskoza.addSong(new Song("Schweine", "Viskoza", 3.55));
        viskoza.addSong(new Song("Butterdash", "Viskoza", 4.15));
        viskoza.addSong(new Song("Basta", "Viskoza", 2.45));
        this.collection.add(netrunner);
        this.collection.add(viskoza);
    }

    public void playNextSong() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty!");
            return;
        }
        if (!goingForward) {
            iterator.next();
            goingForward = true;
        }
        if (iterator.hasNext()) {
            currentSong = iterator.next();
            System.out.println("Now playing: " + currentSong);
        } else {
            System.out.println("End of playlist");
            goingForward = false;
        }
    }

    public void playPreviousSong() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty!");
            return;
        }
        if (goingForward) {
            iterator.previous();
            goingForward = false;
        }
        if (iterator.hasPrevious()) {
            currentSong = iterator.previous();
            System.out.println("Now playing: " + currentSong);
        } else {
            System.out.println("You are at the beginning of the list!");
        }
    }

    public void play() {
            System.out.println("Replaying song: " + currentSong);
    }

    public void addSongToPlaylist(String title) {
        Song song = findSong(title);
        if (song != null) {
            playlist.add(song);
            iterator = playlist.listIterator();
        } else {
            System.out.println("Song not found!");
        }

    }

    public void removeCurrentSong(){
        if(!playlist.isEmpty()) {
            iterator.remove();
            System.out.println("Song removed!");
            if (iterator.hasPrevious()) {
                currentSong = iterator.previous();
                System.out.println("Now playing: " + currentSong);
            } else if (iterator.hasNext()) {
                currentSong = iterator.next();
                System.out.println("Now playing: " + currentSong);
            }
        } else {
            System.out.println("Playlist is empty!");
        }
    }

    private Song findSong(String title) {
        for (int i = 0; i < collection.size(); i++) {
            ArrayList<Song> songs = collection.get(i).getSongs();
            for (Song checkedSong : songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
        }
        return null;
    }

}
