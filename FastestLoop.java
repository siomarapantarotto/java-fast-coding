/**
 * This class compares the performance of two loops that iterate over 
 * a range of values.
 * 
 * Both loops aim to iterate based on the square root of a large number `n`.
 *  
 * The key difference lies in how the loops calculate the iteration limit,
 * which has a significant impact on their efficiency.
 */
public class FastestLoop {
    public static void main(String[] args) {

        Integer n = 1_000_000_000; // Large number for loop comparison

        // LOOP 1: Iterating until i * i < n
        long start1 = System.currentTimeMillis();
        System.out.println("\nSystem.currentTimeMillis: " + start1);
        for (int i = 0; i * i < n; i++) {
            // Simulated work inside the loop
        }
        long finish1 = System.currentTimeMillis();
        System.out.println("System.currentTimeMillis: " + finish1);
        System.out.println("Loop 1 took: " + (finish1 - start1) + " msecs");

        // LOOP 2: Iterating until i < Math.sqrt(n)
        long start2 = System.currentTimeMillis();
        System.out.println("\nSystem.currentTimeMillis: " + start2);
        for (int i = 0; i < Math.sqrt(n); i++) {
            // Simulated work inside the loop
        }
        long finish2 = System.currentTimeMillis();
        System.out.println("System.currentTimeMillis: " + finish2);
        System.out.println("Loop 2 took: " + (finish2 - start2) + " msecs");
    }
}

/**
 * Explanation:
 * 
 * - **Loop 1:**
 * - Condition: `i * i < n`
 * - Efficiency: Less efficient
 * - Reason: The loop condition `i * i < n` recalculates `i * i` on every
 * iteration.
 * This multiplication operation becomes more expensive as `i` increases, making
 * the loop slower.
 * Additionally, this loop iterates through all possible values of `i`,
 * performing unnecessary operations.
 * - Execution: The loop continues until `i * i` exceeds `n`, meaning it
 * iterates roughly up to the square root of `n`.
 * 
 * - **Loop 2:**
 * - Condition: `i < Math.sqrt(n)`
 * - Efficiency: More efficient
 * - Reason: The loop calculates the square root of `n` once before the loop
 * starts and uses this precomputed value as the iteration limit.
 * This avoids the need to repeatedly calculate `i * i` during each iteration,
 * reducing computational overhead.
 * Since the loop iterates directly up to the square root of `n`, it minimizes
 * the number of iterations.
 * - Execution: The loop runs fewer iterations because `i` increments directly
 * up to the precomputed square root of `n`.
 * 
 * **Conclusion:**
 * Loop 2 is more efficient because it avoids the costly multiplication
 * operation inside the loop condition and minimizes the number of iterations
 * by directly calculating the square root of `n` before the loop begins.
 */
