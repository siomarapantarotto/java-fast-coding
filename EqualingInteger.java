public class EqualingInteger {
    public static void main(String[] args) {
        Integer a = 1000, b = 1000; // Tricky!
        Integer c = 100, d = 100;

        System.out.println((a == b) + ", " + (c == d));
    }
}
/**
 * false, true : Java handles the caching of Integer objects.
 * In Java, integers from -128 to 127 are cached, so when you create an
 * Integer object with a value in that range, you will get a reference to
 * an existing object. However, for values outside that range, a new object
 * is always created, c and d are both assigned the value of 100, which falls
 * within the cached range. Therefore, both c and d reference the same Integer
 * object in memory, resulting in c == d being true. On the other hand, a and b
 * are assigned the value of 1000, which is outside the cached range. Therefore,
 * two separate Integer objects are created for a and b, resulting in a == b
 * being false.
 */
