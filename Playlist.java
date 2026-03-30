import java.util.ArrayList;

/**
 * Manages an ArrayList of Media items.
 * Uses the parent type Media to store Song, Podcast, and MusicVideo objects.
 */
public class Playlist {
    private ArrayList<Media> list = new ArrayList<>();

    /**
     * Adds a media item to the playlist.
     * @param m the item to add
     */
    public void add(Media m) {
        list.add(m);
        System.out.println("Added: " + m.getTitle());
    }

    /**
     * Removes the item at the given 0-based index.
     * @param i the index to remove
     */
    public void remove(int i) {
        if (i >= 0 && i < list.size()) {
            System.out.println("Removed: " + list.get(i).getTitle());
            list.remove(i);
        } else {
            System.out.println("Invalid number.");
        }
    }

    /**
     * Updates the title of the item at the given 0-based index.
     * @param i the index to update
     * @param newTitle the new title
     */
    public void update(int i, String newTitle) {
        if (i >= 0 && i < list.size()) {
            list.get(i).setTitle(newTitle);
        } else {
            System.out.println("Invalid number.");
        }
    }

    /**
     * Displays all items in the playlist.
     * Calls display() on each item, demonstrating polymorphism.
     */
    public void showAll() {
        if (list.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print((i + 1) + ". ");
            list.get(i).display(); // POLYMORPHISM: same call, different output per type
        }
    }

    /** @return the number of items in the playlist */
    public int size() { return list.size(); }
}