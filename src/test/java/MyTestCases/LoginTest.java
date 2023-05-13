package MyTestCases;

import org.testng.annotations.Test;

public class LoginTest {
    String b = System.getProperty("browser");

    @Test
    public void testFirst() {
        System.out.println("hi this my first test");

        System.out.println("broswer name selected: "+ b);
    }

    @Test
    public void testSecond() {
        System.out.println("hi this my second test");
        System.out.println("this parameter is coming from console: "+System.getProperty("name"));
        System.out.println("broswer name selected: "+ b);
    }

    @Test
    public void testThird() {
        System.out.println("hi this my Third test");
        System.out.println("broswer name selected: "+ b);
    }

}
