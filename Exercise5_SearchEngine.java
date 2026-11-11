/**
 * Exercise 5 - Medium
 * A tiny search engine. Stores 10 sample paragraphs in a String array, then
 * searches for a phrase using String.contains() and prints the index(es)
 * and the matching paragraph(s). If nothing matches, a "not found" message
 * is printed.
 */
public class Exercise5_SearchEngine {
    public static void main(String[] args) {
        String[] paragraphs = {
            "Lose all the weight you want.",
            "I can't I must work",
            "That would be like a keyword search.",
            "This would be Victoria.",
            "Join the party.",
            "To be or not to be.",
            "That is a question to test keyword search.",
            "Can you find a needle in a hay stack?",
            "This could be the last paragraph, but its not.",
            "Ada Lovelace is the worlds first programmer as of 1860."
        };

        String phrase = "keyword search";

        System.out.println("Searching for: \"" + phrase + "\"");
        System.out.println("----------------------------------------");

        boolean found = false;

        for (int i = 0; i < paragraphs.length; i++) {
            if (paragraphs[i].toLowerCase().contains(phrase.toLowerCase())) {
                found = true;
                System.out.println("Found at index [" + i + "]: " + paragraphs[i]);
            }
        }

        if (!found) {
            System.out.println("Sorry, the phrase \"" + phrase + "\" was not found.");
        }
    }
}
