package superandsubclasses;

public class SuperClass {

    private void doSomething(String message) {
        System.out.println("SuperClass doing something with message: " + message);
    }

    public void callDoSomething(String message) {
        doSomething(message);
    }

}
