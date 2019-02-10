/**
 * RandomGenerator
 * @author Team Jam
 */
package programFunctions;
import java.util.Random;
public class RandomGenerator {
    /**
     * random holds the generator aspect
     */
    private Random random;
    /**
     * Constructor with no arguments
     * <p>
     *     Sets up the object
     * </p>
     */
    public RandomGenerator() {
        random = new Random();
    }
    /**
     * Function definition for generateLong()
     * <P>
     *     Generates and returns a random long
     * </P>
     * @return a random long
     */
    public long generateLong() {
        return random.nextLong();
    }
    /**
     * Function definition for generateInt()
     * <P>
     *     Generates and returns an integer within the bound
     * </P>
     * @param bound is the upper limit
     * @return the random int
     */
    public int generateInt(int bound) {
        return random.nextInt(bound);
    }
}
