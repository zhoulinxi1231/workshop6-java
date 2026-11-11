/**
 * Exercise 7 - Medium (driver class)
 * Makes Boxes objects at a couple of sizes and exercises the class.
 */
public class BoxDriver {
    public static void main(String[] args) {
        Boxes small = new Boxes(5);
        System.out.println("Box size: " + small);
        small.draw();
        System.out.println();

        Boxes big = new Boxes(8);
        System.out.println("Box size: " + big);
        big.draw();
        System.out.println();

        // also test the setter / size cap
        Boxes tooBig = new Boxes(20);   // should be capped at 10
        System.out.println("Box size (capped): " + tooBig);
        tooBig.draw();
    }
}
