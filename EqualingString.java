/**
 * This class demonstrates different cases of string comparison in Java.
 * It highlights how string interning works and the differences in behavior
 * when strings are created using literals vs. the `new` keyword.
 */
public class EqualingString {

    /**
     * The main method where various string comparison scenarios are tested.
     */
    public static void main(String[] args) {
        /**
         * Case 1: String literal comparison.
         * Explanation:
         * - In Java, string literals are interned, meaning that if
         * two strings have the same content and are created as literals,
         * they will point to the same memory location in the string pool.
         * Result:
         * - true: str1 and str2 point to the same interned string "Hello".
         */
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2); // Output: true

        /**
         * Case 2: Compile-time string concatenation.
         * Explanation:
         * - The expression "Hel" + "lo" is evaluated at compile time,
         * resulting in the string "Hello". Since this string is a literal,
         * it is also interned.
         * Result:
         * - true: str3 and str4 reference the same interned string "Hello".
         */
        String str3 = "Hello";
        String str4 = "Hel" + "lo";
        System.out.println(str3 == str4); // Output: true

        /**
         * Case 3: Using the `new` keyword to create strings. *
         * Explanation:
         * - When a string is created using the `new` keyword, a new object is
         * created in memory, even if its content is identical to that of
         * another string. This results in different memory locations for
         * each new string object. *
         * Result:
         * - false: str5 and str6 do not reference the same memory location,
         * and neither do str7 and str8, despite having identical content.
         */
        String str5 = "Hello";
        String str6 = new String("Hello");
        System.out.println(str5 == str6); // Output: false

        String str7 = new String("Hello");
        String str8 = new String("Hello");
        System.out.println(str7 == str8); // Output: false
    }
}
