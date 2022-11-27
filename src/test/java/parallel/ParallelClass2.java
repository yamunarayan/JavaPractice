package parallel;

import org.testng.annotations.Test;

public class ParallelClass2 {

    @Test(invocationCount = 2)
    public void testP2One(){
        System.out.println("Executing from testP2One "+ Thread.currentThread().getId());
    }

    @Test(invocationCount = 2)
    public void testP2Two(){
        System.out.println("Executing from testP2Two "+ Thread.currentThread().getId());
    }

    @Test(invocationCount = 2,threadPoolSize = 2)
    public void testP2Three(){
        System.out.println("Executing from testP2Three "+ Thread.currentThread().getId());
    }
}
