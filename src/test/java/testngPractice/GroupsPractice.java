package testngPractice;

import org.testng.annotations.Test;

@Test(groups={"API","Fun"})
public class GroupsPractice {

    @Test(groups = {"Sanity"},priority = 2)
    public void test(){
        System.out.println("Executing from test");
    }

    @Test(groups = {"Smoke","Sanity"},priority = 1)
    public void test1(){
        System.out.println("Executing from test1");
    }

    @Test(groups = {"Smoke","Regression"},priority = 2)
    public void test2(){
        System.out.println("Executing from test2");
    }

    @Test(groups = {"method"},priority = 1)
    public void test3(){
        System.out.println("Executing from test3");
    }


}
