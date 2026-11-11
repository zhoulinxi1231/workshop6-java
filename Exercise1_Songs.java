/**
 * Exercise 1 - Easy
 * Stores 10 favourite songs in one String array and the matching artists
 * in a second parallel String array, then prints them out.
 */
public class Exercise1_Songs {
    public static void main(String[] args) {
        String[] songs = {
            "Bohemian Rhapsody",
            "Imagine",
            "Hey Jude",
            "Hotel California",
            "Smells Like Teen Spirit",
            "Billie Jean",
            "Sweet Child O' Mine",
            "Wonderwall",
            "Every Breath You Take",
            "Like a Rolling Stone"
        };

        String[] artists = {
            "Queen",
            "John Lennon",
            "The Beatles",
            "Eagles",
            "Nirvana",
            "Michael Jackson",
            "Guns N' Roses",
            "Oasis",
            "The Police",
            "Bob Dylan"
        };

        System.out.println("=== My Top 10 Songs ===");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
