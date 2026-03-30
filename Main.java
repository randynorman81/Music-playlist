import java.util.Scanner;

/**
 * Entry point for Gator Playlist Manager.
 * Demonstrates inheritance and polymorphism through a menu-driven console app.
 */
public class Main {
    /**
     * Runs the main menu loop.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Playlist p = new Playlist();
        boolean run = true;

        System.out.println("Welcome to Gator Playlist Manager!");

        while (run) {
            System.out.println("\n1. Add Song\n2. Add Podcast\n3. Add Music Video\n4. Remove\n5. View All\n6. Update Title\n7. Exit");
            System.out.print("Choose: ");

            try {
                int choice = Integer.parseInt(in.nextLine());

                if (choice == 1) {
                    System.out.print("Title: "); String t = in.nextLine();
                    System.out.print("Artist: "); String a = in.nextLine();
                    System.out.print("Rating (1-5): "); int r = Integer.parseInt(in.nextLine());
                    p.add(new Song(t, a, r));

                } else if (choice == 2) {
                    System.out.print("Title: "); String t = in.nextLine();
                    System.out.print("Host: "); String h = in.nextLine();
                    System.out.print("Episode #: "); int ep = Integer.parseInt(in.nextLine());
                    p.add(new Podcast(t, h, ep));

                } else if (choice == 3) {
                    System.out.print("Title: "); String t = in.nextLine();
                    System.out.print("Artist: "); String a = in.nextLine();
                    System.out.print("Resolution (e.g. 4K): "); String res = in.nextLine();
                    p.add(new MusicVideo(t, a, res));

                } else if (choice == 4) {
                    p.showAll();
                    System.out.print("Remove which number? ");
                    p.remove(Integer.parseInt(in.nextLine()) - 1);

                } else if (choice == 5) {
                    p.showAll();

                } else if (choice == 6) {
                    p.showAll();
                    System.out.print("Update which number? ");
                    int idx = Integer.parseInt(in.nextLine()) - 1;
                    System.out.print("New title: ");
                    p.update(idx, in.nextLine());

                } else if (choice == 7) {
                    run = false;
                    System.out.println("Goodbye!");

                } else {
                    System.out.println("Please enter a number 1-7.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        in.close();
    }
}