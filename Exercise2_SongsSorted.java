/**
 * Exercise 2 - Hard
 * Same data as Exercise 1, but prints the songs in alphabetical order.
 * Uses a bubble sort on the song title array, swapping the matching artist
 * in the second array at the same time so the pairings stay correct.
 */
public class Exercise2_SongsSorted {
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

        // Bubble sort by song title (case-insensitive)
        for (int i = 0; i < songs.length - 1; i++) {
            for (int j = 0; j < songs.length - 1 - i; j++) {
                if (songs[j].compareToIgnoreCase(songs[j + 1]) > 0) {
                    // swap song
                    String tmpSong = songs[j];
                    songs[j] = songs[j + 1];
                    songs[j + 1] = tmpSong;
                    // swap matching artist so the pair stays together
                    String tmpArtist = artists[j];
                    artists[j] = artists[j + 1];
                    artists[j + 1] = tmpArtist;
                }
            }
        }

        System.out.println("=== Songs in Alphabetical Order ===");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
