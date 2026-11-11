/**
 * Exercise 6 - Easy
 *
 * Identify the class variables (static, shared by every object):
 *      - x   (declared 'public static int x = 7;')
 *
 * Identify the instance variables (one copy per object):
 *      - y   (declared 'public int y = 3;')
 *
 * Because x is static, a.x = 1 and b.x = 2 change the SAME single x.
 * The last write wins, so both a.x and b.x print 2.
 * y is per-object, so a.y = 5 and b.y = 6 stay independent.
 */
public class Exercise6_IdentifyMyParts {

    // inner class so the file stays self-contained
    public static class IdentifyMyParts {
        public static int x = 7;   // class (static) variable
        public int y = 3;          // instance variable
    }

    public static void main(String[] args) {
        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();

        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;   // this overwrites the shared static x

        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
    }
}
