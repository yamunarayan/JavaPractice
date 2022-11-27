package testngPractice;

import org.testng.annotations.Test;

public class Attributes {
    @Test(invocationCount = 2)
    public void testA(){
        System.out.println("Executing test--"+ Thread.currentThread().getId());
    }


    @Test(invocationCount = 3,threadPoolSize = 3)
    public void testA1(){
        System.out.println("Executing test1---"+ Thread.currentThread().getId());
    }

    @Test(timeOut = 3000)
    public void testA2() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Executing test1---"+ Thread.currentThread().getId());
    }


}
