public class UTF8ASCIISubset {
    /**
     * Java uses UTF-8, not ASCII. However, UTF8 is a superset of ASCII, and
     * any ASCII character can be represented in UTF-8 without any difference.
     */
    public static void main(String[] args) {

        System.out.println("LinkedIn Quiz");

        // Convert an UTF8 ASCII subset code to its corresponding char value
        byte[] b = {100, 101, 102};
        String s = new String(b);
        System.out.println(s);

        // Cast the char to int to get its corresponding UTF8 ASCII subset code
        char dLowerCase = 'd';
        int dUTF8 = (int) dLowerCase;
        System.out.println("The UTF8 code of " + dLowerCase + " is " + dUTF8);

        int eUTF8 = (int) 'e';
        System.out.println("The UTF8 code of e is " + eUTF8);

        System.out.println("The UTF8 code of f is " + (int) 'f');
    }
}
/**
 * UTF-8 is a variable-length encoding scheme that can represent any Unicode
 * character, including characters beyond the ASCII character set.
 * However, for characters that fall within the ASCII range (0 to 127),
 * UTF-8 uses the same 8-bit representation as ASCII. This means that any
 * ASCII character is also a valid UTF-8 character, and any program or
 * system that understands ASCII will also understand UTF-8.
 */
