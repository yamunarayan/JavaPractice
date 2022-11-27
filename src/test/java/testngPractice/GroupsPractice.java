package testngPractice;

import org.testng.annotations.Test;

@Test(groups={"API","Fun"})
public class GroupsPractice {

    @Test(groups = {"Sanity"})
    public void test(){
        System.out.println("Executing from test");
    }

    @Test(groups = {"Smoke","Sanity"})
    public void test1(){
        System.out.println("Executing from test1");
    }

    @Test(groups = {"Smoke","Regression"})
    public void test2(){
        System.out.println("Executing from test2");
    }

    @Test(groups = {"method"})
    public void test3(){
        System.out.println("Executing from test3");
    }


}
