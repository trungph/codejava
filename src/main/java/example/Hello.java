package example;

/**
 * Greeting.
 */
public class Hello {

    public String sayHello() {
        return "Hello";
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.sayHello());
    }
}
