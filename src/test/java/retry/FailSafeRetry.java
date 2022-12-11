package retry;

import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FailSafeRetry {
    RetryPolicy<Object> retryPolicy = new RetryPolicy<Object>().
            handle(AssertionError.class).withDelay(Duration.ofMillis(1000)).withMaxRetries(5);

    @Test
    public void failSafeRetryMethod(){

      Failsafe.with(retryPolicy).run(()->{
          System.out.println("testing failsafe method");
          Assert.assertEquals(1,2);
      });
    }
}
