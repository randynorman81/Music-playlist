# Music-playlist

# Music Playlist Manager

### Description
A Java console application designed to manage a digital music collection. This project demonstrates core Object-Oriented Programming (OOP) principles including encapsulation, custom constructors, and dynamic collection management using ArrayLists.

### Key Features
* **Custom Song Creation:** Users can input specific details for new songs.
* **Default Placeholder:** Users can quickly add a "default" song to the list using a secondary constructor.
* **Encapsulation & Validation:** A built-in "bouncer" rule in the Song class ensures all ratings are capped between 1 and 5, regardless of user input.
* **Playlist Statistics:** A non-trivial method that iterates through the collection to calculate the average rating of all songs.
* **Dynamic Storage:** Uses an ArrayList to allow the playlist to grow or shrink dynamically.

### How to Run
1. Open your terminal or command prompt.
2. Navigate to the folder containing the project files.
3. Compile the code by typing: 
   `javac Main.java Song.java Playlist.java`
4. Run the application by typing: 
   `java Main`

### Interaction Flow
1. **Option 1:** Manually enter Title, Artist, Duration, and Rating.
2. **Option 2:** Automatically adds a placeholder song ("Untitled") to the list.
3. **Option 3:** Displays every song currently stored in the ArrayList.
4. **Option 4:** Triggers a calculation loop to show the average rating of all entries.
5. **Option 5:** Safely closes the Scanner and exits the program.

---

### AI-Assisted Development Report
**AI Used:** Gemini (Google)

**What I accepted/changed:**
* I used GAI to help structure the `Playlist` class and the `ArrayList` logic.
* I used the AI to help me understand Javadoc syntax (`@param`) and the difference between an Array and an ArrayList.
* **Modifications:** I manually adjusted the `setRating` logic to ensure it strictly followed the 1-5 scale required by my design. I also simplified the AI's complex menu suggestions to keep the user interface clean and easy to follow.
* **Verification:** I manually compiled the code using the terminal and verified that entering a rating of "10" resulted in a saved rating of "5," proving the encapsulation logic works.
