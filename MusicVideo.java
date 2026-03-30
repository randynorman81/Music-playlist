/**
 * A Music Video in the playlist. Extends Media.
 * Unique attribute: resolution.
 */
public class MusicVideo extends Media {
    private String resolution;

    /**
     * Constructs a MusicVideo.
     * @param title the video title
     * @param artist the artist name
     * @param resolution the video resolution (e.g. "4K")
     */
    public MusicVideo(String title, String artist, String resolution) {
        super(title, artist);
        this.resolution = resolution;
    }

    /** @return the resolution */
    public String getResolution() { return resolution; }

    @Override
    public void display() {
        System.out.println("[MUSIC VIDEO] " + getTitle() + " | Artist: " + getCreator() + " | Resolution: " + resolution);
    }
}