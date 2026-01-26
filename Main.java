//import scanner for user input
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//new scanner object
        Scanner input = new Scanner(System.in);
        Playlist myPlaylist = new Playlist();
        boolean running = true;

        System.out.println("Playlist Manager");

        while (running) {
            System.out.println("1. Add Custom Song");
            System.out.println("2. Add Default Placeholder");
            System.out.println("3. View All Songs");
            System.out.println("4. View Playlist Statistics");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = input.nextInt();
            input.nextLine(); 

            if (choice == 1) {
// Collect song details from user
                System.out.print("Enter Title: ");
                String title = input.nextLine();
                System.out.print("Enter Artist: ");
                String artist = input.nextLine();
                System.out.print("Enter Duration (sec): ");
                int duration = input.nextInt();
                System.out.print("Enter Rating (1-5): ");
                int rating = input.nextInt();

                Song newSong = new Song(title, artist, duration, rating);
                myPlaylist.addSong(newSong);

            } else if (choice == 2) {
//song is blank because they did not add details
                Song blankSong = new Song();
                myPlaylist.addSong(blankSong);

            } else if (choice == 3) {
                myPlaylist.showAllSongs();

            } else if (choice == 4) {
                myPlaylist.showAverageRating();

            } else if (choice == 5) {
                System.out.println("Exiting program...");
                running = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        input.close();
    }
}