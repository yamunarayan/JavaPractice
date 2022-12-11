package parallel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void test(){
        System.out.println("This is test execution");
    }

    @Test
    public void test1(){
        System.out.println("This is test1 execution");
    }

    @Test
    public void test2(){
        System.out.println("This is test2 execution");
    }

    int i=0,j=3;
    @Test(successPercentage = 80, invocationCount = 3)
    public void test3(){
    if(i%2==0 && i<=j){
        Assert.assertTrue(true);
    }
    else{
        Assert.assertTrue(false);
    }
    i++;
        System.out.println("This is test3 execution");
    }
}
