// String comparisons in Java
public class EqualingString {
    public static void main(String[] args) {
        /**
         * Case 1: In Java, string literals are interned, meaning that if
         * two strings have the same content and are created as literals,
         * they will point to the same memory location.
         * Result: true - both strings point to the same string in the string pool.
         */
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);

        /**
         * Case 2: The expression "Hel" + "lo" is evaluated at compile time,
         * so str4 will also reference the same interned string as str3.
         * Result: true - because both str3 and str4 are pointing to the same
         * interned string "Hello".
         */
        String str3 = "Hello";
        String str4 = "Hel" + "lo";
        System.out.println(str3 == str4);

        /**
         * Case 3: When using the 'new' keyword to create a string, a new object is
         * created in memory, even if its content is the same as another string.
         * This means that str5 and str6 or str7 and str8 will reference different
         * objects in memory, even though their contents ("Hello") are identical.
         * Result: false - because str5 and str6 as well as str7 and str8 are pointing
         * to different memory locations.
         */
        String str5 = "Hello";
        String str6 = new String("Hello");
        System.out.println(str5 == str6);

        String str7 = new String("Hello");
        String str8 = new String("Hello");
        System.out.println(str7 == str8);
    }
}
