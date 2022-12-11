package testngPractice;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class VariableSharing {

    @Test
    public void testVOne(ITestContext context){
        int a=10;
        context.setAttribute("value", a);
        System.out.println(a);
        System.out.println("Testing variable sharing1");
    }

    @Test(dependsOnMethods = {"testVOne"})
    public void testVTwo(ITestContext context){
       // int a=10;
        String a = context.getAttribute("value").toString();
        //System.out.println(a);
        System.out.println("Testing variable sharing 2 "+ a);
    }

}
