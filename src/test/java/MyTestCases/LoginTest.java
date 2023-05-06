package MyTestCases;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void testFirst() {
        System.out.println("hi this my first test");
    }

    @Test
    public void testSecond() {
        System.out.println("hi this my second test");
        System.out.println("this parameter is coming from console: "+System.getProperty("name"));
    }

    @Test
    public void testThird() {
        System.out.println("hi this my Third test");
    }

}
