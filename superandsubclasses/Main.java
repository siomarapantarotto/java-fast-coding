package superandsubclasses;

public class Main {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.callDoSomething("Hello!"); // Calls the private method in the superclass
    }
}
