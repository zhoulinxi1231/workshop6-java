/**
 * Exercise 3 - Medium
 * Reverses the letters inside each word of a sentence, but keeps the word
 * order and any punctuation (e.g. a trailing full stop) in place.
 *
 * Example:
 *   "To be or not to be."  ->  "oT eb ro ton ot eb."
 */
public class Exercise3_ReverseWords {

    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reverseEachWord(sentence));
    }

    /**
     * Splits the sentence on spaces, reverses the letters inside each token
     * while leaving non-letter characters (like '.' or ',') where they are.
     */
    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(reverseLetters(words[i]));
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    /**
     * Reverses only the letters in a single word, leaving punctuation in place.
     * "be." -> 'b' and 'e' swap, '.' stays at the end -> "eb."
     */
    static String reverseLetters(String word) {
        char[] chars = word.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }
            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
