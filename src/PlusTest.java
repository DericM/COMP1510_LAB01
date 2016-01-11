/**
 * 
 */

/**
 * @author Deric
 *
 *c.
 *1) 8 plus 5 is 85
 *  "8 plus 5 is " concatenated with "8" and then that is concatenated with "5"
 *
 *2)8 plus 5 is 13
 * "8 plus 5 is " is concatenated with the sum of 8 and 5
 *
 *3)13 equals 8 plus 5.
 * The sum of 8 and 5 is concatenated with " equals 8 plus 5."
 *
 *d) Add space after "The first computer was invented about "
 */
public class PlusTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println ("This is a long string that is the " 
                + "concatenation of two shorter strings.");
        System.out.println ("The first computer was invented about " + 55 + "years ago.");
        System.out.println ("8 plus 5 is " + 8 + 5); 
        System.out.println ("8 plus 5 is " + (8 + 5)) ; 
        System.out.println (8 + 5 + " equals 8 plus 5.");

    }

}
