package canaryprism.littlethings.arrays;

/**
 * Things to do with making arrays
 */
public class AnArray {
    
    /**
     * Literal arrays are hard for some reason. this is one way to fix that
     * @param type the type of the array to return
     * @param objects the objects
     * @return the same thing but now it's an array! woo~ primitives will be wrapped
     */
    @SafeVarargs
    public static <E> E[] of(Class<E> type, E... objects) {
        return objects;
    }

    /**
     * Java hates primitive arrays for some reason...
     * @param arr the primitive type array
     * @return the... not primitive... version
     */
    public static Integer[] ofNotPrimitives(int[] arr) {
        Integer[] data = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++)
            data[i] = arr[i];
        return data;
    }
    /**
     * Java hates primitive arrays for some reason...
     * @param arr the primitive type array
     * @return the... not primitive... version
     */
    public static Double[] ofNotPrimitives(double[] arr) {
        Double[] data = new Double[arr.length];
        for (int i = 0; i < arr.length; i++)
            data[i] = arr[i];
        return data;
    }
    /**
     * Java hates primitive arrays for some reason...
     * @param arr the primitive type array
     * @return the... not primitive... version
     */
    public static Long[] ofNotPrimitives(long[] arr) {
        Long[] data = new Long[arr.length];
        for (int i = 0; i < arr.length; i++)
            data[i] = arr[i];
        return data;
    }


    public static int[] sequenceOf(int startvalue, int length, int increment) {
        int[] data = new int[length];
        for (int i = 0, k = startvalue; i < length; i++, k+= increment)
            data[i] = k;
        return data;
    }
}
