package arrayexception;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[5] = 10;
            System.out.println("No Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception");
        } finally {
            System.out.println("Finally Block");
        }
    }
}
/*
 * The output of this program is:
 * Array Exception
 * Finally Block
 */
