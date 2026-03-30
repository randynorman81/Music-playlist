# Gator Playlist Manager

## Purpose
A Java app for managing a personal media playlist. Users can add Songs, Podcasts, and Music Videos, then remove, update, and view them.

## Key Features
- Add a Song, Podcast, or Music Video to playlist
- Remove an item by number
- Update an item's title
- View all items 

## How to Run
1. Create a new Java project in your IDE
2. Copy all `.java` files into the `src` folder
3. Run `Main.java`
4. Use number menu to interact

## Class Structure
```
Media (abstract parent)
 Song        — unique attribute: rating (1–5)
 Podcast     — unique attribute: episode number
 MusicVideo  — unique attribute: resolution

Playlist     — ArrayList<Media> storing all three types
Main         — menu loop and user interaction
```

## Level Completed
Level 1 (Required)

## Level 2 Completed 
Level 2 (extra)

## Level 3 Attempted
Level 3 (extra)
