package testngPractice;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExpectedExceptionPractice {

    @Test(timeOut =1000,expectedExceptions =  ThreadTimeoutException.class)
    public void testone() throws InterruptedException {
        Thread.sleep(1500);
       System.out.println("Execcuting from testone");
    }
}
