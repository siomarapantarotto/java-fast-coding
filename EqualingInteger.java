// Integer caching in Java
public class EqualingInteger {
    public static void main(String[] args) {
        Integer a = 1000, b = 1000; // Tricky!
        Integer c = 100, d = 100;

        System.out.println((a == b) + ", " + (c == d));
    }
}
/**
 * Output: false, true
 * Java caches Integer objects for values between -128 and 127.
 * For any Integer within this range, the same object reference is reused.
 * For values outside that range, a new object is always created.
 */
