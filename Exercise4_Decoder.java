/**
 * Exercise 4 - Easy
 * Decodes the coded message "G tgsl Qefe." using the substitution table
 * from the worksheet.
 *
 * Cipher row (top):   a b c d e f g h i j k l m n o p q r s t u v w x y z
 * Plain  row (bottom): c r g z a v i b s d o e q f h u j x k l w m y n p t
 *
 * The mapping lives in a HashMap so swapping in a new message or a new
 * key table is easy: just change CIPHER_MESSAGE or replace the map entries.
 */
import java.util.HashMap;

public class Exercise4_Decoder {
    public static void main(String[] args) {
        String cipherMessage = "G tgsl Qefe.";

        HashMap<Character, Character> key = new HashMap<>();
        // cipher -> plaintext, as given in the table
        key.put('a', 'c'); key.put('b', 'r'); key.put('c', 'g');
        key.put('d', 'z'); key.put('e', 'a'); key.put('f', 'v');
        key.put('g', 'i'); key.put('h', 'b'); key.put('i', 's');
        key.put('j', 'd'); key.put('k', 'o'); key.put('l', 'e');
        key.put('m', 'q'); key.put('n', 'f'); key.put('o', 'h');
        key.put('p', 'u'); key.put('q', 'j'); key.put('r', 'x');
        key.put('s', 'k'); key.put('t', 'l'); key.put('u', 'w');
        key.put('v', 'm'); key.put('w', 'y'); key.put('x', 'n');
        key.put('y', 'p'); key.put('z', 't');

        System.out.println("Coded message:  " + cipherMessage);
        System.out.println("Decoded message: " + decode(cipherMessage, key));
    }

    static String decode(String message, HashMap<Character, Character> key) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (Character.isLetter(c)) {
                // look up using the lowercase version
                char lower = Character.toLowerCase(c);
                char plain = key.getOrDefault(lower, lower);
                // preserve the original case
                if (Character.isUpperCase(c)) {
                    plain = Character.toUpperCase(plain);
                }
                out.append(plain);
            } else {
                // spaces, full stops, etc. pass straight through
                out.append(c);
            }
        }
        return out.toString();
    }
}
