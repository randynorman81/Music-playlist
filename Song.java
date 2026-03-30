/**
 * A Song in the playlist. Extends Media.
 * Unique attribute: rating (1-5).
 */
public class Song extends Media {
    private int rating;

    /**
     * Constructs a Song.
     * @param title the song title
     * @param artist the artist name
     * @param rating the rating 1-5 (clamped if out of range)
     */
    public Song(String title, String artist, int rating) {
        super(title, artist);
        setRating(rating);
    }

    /**
     * Sets the rating. Clamped between 1 and 5.
     * @param r the rating value
     */
    public void setRating(int r) {
        this.rating = (r < 1) ? 1 : (r > 5) ? 5 : r;
    }

    /** @return the rating */
    public int getRating() { return rating; }

    @Override
    public void display() {
        System.out.println("[SONG] " + getTitle() + " | Artist: " + getCreator() + " | Rating: " + rating + "/5");
    }
}