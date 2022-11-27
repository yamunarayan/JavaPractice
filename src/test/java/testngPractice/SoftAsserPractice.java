package testngPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserPractice {

@Test
    public void testSTest(){

    SoftAssert softA= new SoftAssert();
    softA.assertEquals(1,2);
    softA.assertTrue(1==2);
    System.out.println("Soft Test passed");
    softA.assertAll();


       // Assert.assertEquals(1,2);
        System.out.println("Test passed");
    }
}
