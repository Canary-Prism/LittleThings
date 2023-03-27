package canaryprism.littlethings.math;

import java.util.Arrays;
import java.util.List;

/**
 * All the things about prime numbers that one doesn't need
 */
public class PrimeNumbers {
    
    /**
     * calculates a list of all prime numbers under the specified {@code limit}
     * @param limit the limit to search to
     * @return the list of prime numbers
     */
    public static List<Integer> primesUnder(int limit) {

        Integer[] list = new Integer[limit];
        for (int i = 0; i < limit; i++)
            list[i] = i;
        for (int i = 2; i < list.length; i++) 
            if (list[i] != 0)
                for (int k = i * 2; k < list.length; k += i) 
                    list[k] = 0;

        list[1] = 0;
        
        return Arrays.asList(list).stream().filter(i -> i != 0).toList();
    }

    /**
     * pretty self explanatory, returns {@code true} if {@code value} is prime, {@code false} if not
     * @param value the value
     * @return if it's prime
     */
    public static boolean isPrime(int value) {
        value = Math.absExact(value);
        if (value == 0 || value == 1)
            return false;
        for (int i = 2; i < value; i++)
            if (value % i == 0)
                return false;
        return true;
    }
}
