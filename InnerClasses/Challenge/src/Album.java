import java.util.ArrayList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    private static class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song){
            if(findSong(song.getTitle())) {
                System.out.println("This song is already on the album!");
                return false;
            }
            songs.add(song);

            return true;
        }

        private boolean findSong(String title){
            for (Song checkedSong: songs) {
                if(checkedSong.getTitle().equals(title))
                {
                    return true;
                }
            }
            System.out.println("The song " + title + " is not in this album");
            return false;
        }

        private Song findSong(int number){
            if((number - 1) <= songs.size()){
                return songs.get(number -1);
            }
            return null;
        }

        private ArrayList<Song> getSongList() {
            return this.songs;
        }
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return this.songs.getSongList();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }
}
