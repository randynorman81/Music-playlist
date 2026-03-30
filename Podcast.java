/**
 * A Podcast episode in the playlist. Extends Media.
 * Unique attribute: episode number.
 */
public class Podcast extends Media {
    private int episodeNumber;

    /**
     * Constructs a Podcast.
     * @param title the podcast title
     * @param host the host name
     * @param episodeNumber the episode number (minimum 1)
     */
    public Podcast(String title, String host, int episodeNumber) {
        super(title, host);
        this.episodeNumber = (episodeNumber < 1) ? 1 : episodeNumber;
    }

    /** @return the episode number */
    public int getEpisodeNumber() { return episodeNumber; }

    @Override
    public void display() {
        System.out.println("[PODCAST] " + getTitle() + " | Host: " + getCreator() + " | Episode: #" + episodeNumber);
    }
}