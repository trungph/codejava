package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Hello}.
 */
public class HelloTest {

    @Test
    public void sayHelloShouldReturnHello() {
        Hello hello = new Hello();
        assertEquals("Hello", hello.sayHello());
    }
}
