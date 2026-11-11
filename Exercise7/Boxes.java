/**
 * Exercise 7 - Medium
 * The Boxes class: knows its own size (capped at 10), can print itself as
 * "size x size", and can draw an ASCII box on the console.
 */
public class Boxes {
    private int size;

    // Constructor: accept the size of the box
    public Boxes(int size) {
        setSize(size);
    }

    // Setter: keep the size within the allowed range (1 to 10)
    public void setSize(int size) {
        if (size < 1) {
            this.size = 1;
        } else if (size > 10) {
            this.size = 10;
        } else {
            this.size = size;
        }
    }

    public int getSize() {
        return size;
    }

    // Returns the size as a String, e.g. "10 x 10"
    @Override
    public String toString() {
        return size + " x " + size;
    }

    // Draws the box to the console using '-' for the top/bottom
    // and '|' for the sides.
    public void draw() {
        // top border
        for (int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println();

        // middle rows: size - 2 rows between the top and bottom border
        for (int row = 0; row < size - 2; row++) {
            System.out.print("|");
            for (int col = 0; col < size - 2; col++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        // bottom border
        for (int i = 0; i < size; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
