
//I now see that ArrayList is different than Array (Array is a determined # of slots.. ArrayList is expandable)
import java.util.ArrayList; 

public class Playlist {
//the ArrayList that will hold all our Song objects
    private ArrayList<Song> songList = new ArrayList<>();

// Add a song to the list
    public void addSong(Song s) {
        songList.add(s);
        System.out.println(s.getTitle() + " added to your playlist!");
    }

//iteration
// This goes through every song in the list and shows its details
    public void showAllSongs() {
        System.out.println("YOUR PLAYLIST");
        for (Song s : songList) {
            s.displaySong();
            System.out.println("-------------------------");
        }
    }

    // NON-TRIVIAL METHOD: Calculate Average Rating
    // This satisfies the "Computing/Summarizing Data" requirement
    public void showAverageRating() {
        if (songList.isEmpty()) {
            System.out.println("Playlist is empty:-(");
            return;
        }
        
        double total = 0;
        for (Song s : songList) {
            total += s.getRating();
        }
        double average = total / songList.size();
        System.out.println("Average Playlist Rating: " + average + " / 5 stars");
    }
}