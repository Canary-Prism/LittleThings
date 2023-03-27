package canaryprism.littlethings.math;

/**
 * Java's native
 * <pre>Math.random()</pre>
 * is kinda finicky so imma add some more stuff to it
 */
public class Random {
    
    /**
     * randomish integer between downlimit and uplimit (inclusive)
     * @param downlimit the lower limit
     * @param uplimit the upper limit
     * @return a randomish {@code int} between the two
     */
    public static int randomInt(int downlimit, int uplimit) {
        return ((int)(Math.random() * (uplimit + 1 - downlimit)) + downlimit);
    }

    /**
     * randomish double between downlimit (inclusive) and uplimit (exclusive)
     * @param downlimit the lower limit
     * @param uplimit the upper limit
     * @return a randomish {@code double} between the two
     */
    public static double randomDouble(double downlimit, double uplimit) {
        return ((Math.random() * (uplimit - downlimit)) + downlimit);
    }

    /**
     * decides by random whether to return {@code true} or {@code false}
     * @param chances the chance of getting a {@code true}. values >= 1 garuntee a {@code true}
     * @return the result
     */
    public static boolean chance(double chances) {
        return Math.random() < chances;
    }

    /**
     * <p>flips a coin</p>
     * <p>this acts exactly as if you did</p>
     * <pre>Random.chance(.5)</pre>
     * <p>with a 50/50 on returning either {@code true} or {@code false}</p>
     * @return the result
     */
    public static boolean coinFlip() {
        return chance(.5);
    }

    /**
     * rolls a 2D6 so you don't have to
     * @return the results from the 2 dice added up
     */
    public static int roll2D6() {
        return randomInt(1, 6) + randomInt(1, 6);
    }
}
