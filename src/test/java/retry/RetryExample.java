package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryExample {

    //(retryAnalyzer = RetryLogic.class)
    @Test
    public void testROne() throws InterruptedException {
        Assert.assertTrue(false);
        System.out.println("Executing from testROne");
    }
}
