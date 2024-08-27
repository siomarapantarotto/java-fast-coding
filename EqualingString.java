public class EqualingString {
    public static void main(String[] args) {
        /**
         * Comparing str1 and str2
         * Explanation: In Java, string literals are interned, meaning that
         * if two strings have the same content and are created as literals,
         * they will point to the same memory location.
         * Result: str1 == str2 will print true because both str1 and str2
         * point to the same string in the string pool.
         */
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2);

        /**
         * Comparing str3 and str4
         * Explanation: The expression "Hel" + "lo" is evaluated at compile time,
         * so str4 will also reference the same interned string as str3.
         * Result: str3 == str4 will print true because both str3 and str4 are
         * pointing to the same interned string "Hello".
         */
        String str3 = "Hello";
        String str4 = "Hel" + "lo";
        System.out.println(str3 == str4);

        /**
         * COmparing str5 and str6
         * Explanation: When using the new keyword to create a string, a new object is
         * created
         * in memory, even if the content of the string is the same as another string.
         * This means that str5 and str6 will reference different objects in memory,
         * even though
         * their contents ("hello") are identical.
         * Result: str5 == str6 will print false because str5 and str6 are pointing to
         * different memory locations.
         */
        String str5 = new String("hello");
        String str6 = new String("hello");
        System.out.println(str5 == str6);

    }
}
