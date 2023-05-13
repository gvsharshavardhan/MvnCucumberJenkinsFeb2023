package MyTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertionDemo {

    @Test
    public void m1(){

        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");

        String name = "abc123";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals("abc",name);

        System.out.println("hi123");
        System.out.println("hi123");
        System.out.println("hi123");

        String email = "abc@123.com";
        sa.assertEquals("abcxyz@123.com",name);

        System.out.println("hi123");
        System.out.println("hi123");
        System.out.println("hi123");

        sa.assertAll();


    }

}
