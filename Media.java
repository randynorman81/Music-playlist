/**
 * Abstract parent class for all playlist items.
 */
public abstract class Media {
    private String title;
    private String creator;

    /**
     * Constructs a Media item.
     * @param title the title of the item
     * @param creator the creator of the item
     */
    public Media(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    /** @return the title */
    public String getTitle() { return title; }

    /**
     * Sets the title. Title cannot be blank.
     * @param title the new title
     */
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Title cannot be blank. Not updated.");
        } else {
            this.title = title;
        }
    }

    /** @return the creator */
    public String getCreator() { return creator; }

    /**
     * Displays this item's details. Each child class overrides this.
     */
    public abstract void display();
}