public class FastestLoop {
    public static void main(String[] args) {

        Integer n = 1_000_000_000;

        // LOOP 1
        long start1 = System.currentTimeMillis();
        System.out.println("\nSystem.currentTimeMillis: " + start1);
        for (int i = 0; i * i < n; i++) {
            // Do something
        }
        long finish1 = System.currentTimeMillis();
        System.out.println("System.currentTimeMillis: " + finish1);
        System.out.println("Loop 1 took: " + (finish1 - start1) + " msecs");

        // LOOP 2
        long start2 = System.currentTimeMillis();
        System.out.println("\nSystem.currentTimeMillis: " + start2);
        for (int i = 0; i < Math.sqrt(n); i++) {
            // Do something
        }
        long finish2 = System.currentTimeMillis();
        System.out.println("System.currentTimeMillis: " + finish2);
        System.out.println("Loop 2 took: " + (finish2 - start2) + " msecs");
    }
}

/**
 * Both loops perform the same condition, which is to loop until
 * the value of i squared (i*i) is less than n.
 * 
 * Loop 2 is faster because it only calculates the square root of n once
 * at the beginning of the loop, while in loop 1, the squaring operation
 * is performed each time the loop condition is checked.
 * 
 * Calculating the square root of a number is generally considered to be
 * faster than calculating its square, especially for larger values of n.
 * 
 * Therefore, loop 2 is more efficient than loop 1.
 */
