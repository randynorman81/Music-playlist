//using the analogy of custom guitar order form to help me understand everything

//the class is the order form template for all guitar orders...
//the private variables are the choices you have when ordering the guitar...
//for this assignment, the title, artist, duration, and rating will be used for each song in this program

/**
 * Represents a single song (hope I am using JavaDOC correct!)
 */
    public class Song {
        private String title;
        private String artist;
        private int duration; 
        private int rating;
    
//this is like submitting the guitar order form... THIS is referring to the current song that is being created
//will use this info to create a NEW object using these details

//this is the defualt set of variables 

/**
* Default parameters for unknown song 
*/
    public Song() {
        this.title = "Untitled";
        this.artist = "Unknown Artist";
        this.duration = 0;
        this.rating = 1; 
    }
    
//this one is for people who want 
    public Song(String title, String artist, int duration, int rating) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
       
//when running program for first time, the "10" rating didn't change to 5... 
//found out I had to use setRating to modify this variable since it has to alter the code when it is ran
        setRating(rating);
    }

//the class variables are encapsulated by making them "private"
//this if statement is public (meaning anyone can see it), it is not returning a value (void)..
//we added "void" because this is the first time we are actually 'doing something'

//rating cannot be lower than 1 (set to auto. become 1 is number is less than 1)
//same concept for a 5 rating (can't be higher than 5...default down to 5 if higher)

/**
* Validates and sets rating between 1 and 5
* @param newRating... user-provided rating
*/


    public void setRating(int newRating) {
        if (newRating < 1) {
            this.rating = 1; 
        } else if (newRating > 5) {
            this.rating = 5; 
        } else {
            this.rating = newRating; //rating song a 2,3, or 4
        }
    }
//using numerous print lines because it's easier for me to understand and "see it"
    public void displaySong() {
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist);
        System.out.println("Length: " + this.duration + " seconds");
        System.out.println("Rating: " + this.rating + " / 5 stars");
    }
    
    public String getTitle() {
        return this.title;
    }

    public int getRating() {
        return this.rating;
    }
}