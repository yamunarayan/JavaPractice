package parallel;

import org.testng.annotations.Test;

public class ParallelClass1 {

    @Test(invocationCount = 2)
    public void testPOne(){
        System.out.println("Executing from testPOne"+ Thread.currentThread().getId());
    }

    @Test(invocationCount = 2)
    public void testPTwo(){
        System.out.println("Executing from testPTwo"+ Thread.currentThread().getId());
    }

    @Test(invocationCount = 2,threadPoolSize = 2)
    public void testPThree(){
        System.out.println("Executing from testPThree"+ Thread.currentThread().getId());
    }
}
