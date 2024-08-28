/**
 * This class demonstrates the behavior of Integer caching in Java.
 * It shows how Java reuses objects for Integer values between -128 and 127.
 */
public class EqualingInteger {

    /**
     * The main method where Integer comparison is tested.
     * 
     * Output: false, true
     * 
     * Java caches Integer objects for values between -128 and 127.
     * - For values within this range, the same object reference is reused.
     * - For values outside this range, new objects are created.
     */
    public static void main(String[] args) {
        // Variables a and b are outside the cached range.
        Integer a = 1000, b = 1000; 

        // Variables c and d are within the cached range.
        Integer c = 100, d = 100;

        // Comparing references of a and b, and c and d.
        System.out.println((a == b) + ", " + (c == d));
    }
}
