package arrayexception;

public class ArrayExceptionsDemo {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[5];
            array[5] = 10; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }

        // NegativeArraySizeException
        try {
            int[] array = new int[-5]; // This will throw NegativeArraySizeException
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException");
        }

        // NullPointerException
        try {
            int[] array = null;
            array[0] = 10; // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }

        // ArrayStoreException
        try {
            Object[] array = new Integer[5];
            array[0] = "String"; // This will throw ArrayStoreException
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException");
        }
    }
}