class HelloWorldMain {

    static int i = printHello();    // no usages

    static int j = printWorld();    // no usages


    //static int k = printAgain();  // commented

    public static void main(String[] args) {
        System.out.println("Main");
    }
    public static int printHello(){ // 1 usage
        System.out.println("Hello");
        return 0;
    }
    public static int printWorld(){ // 1 usage
        System.out.println("World");
        return 1;
    }

    public static int printAgain(){ // no usages
        System.out.println("Again");
        return 1;
    }
}
/*
Result:
"C:\Program Files\Java\jdk-18\bin\java.exe" [...]
Hello
World
Main

Process finished with exit code 0
 */