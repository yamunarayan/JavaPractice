package retry;

import net.jodah.failsafe.RetryPolicy;
import org.testng.TestNG;

import java.time.Duration;
import java.util.Arrays;

public class RunTestNG {
    public static void main(String[] args) {

       /* RetryPolicy<Object> retry=new RetryPolicy<>().
                handle(NullPointerException.class).
                handle(AssertionError.class).
                withDelay(Duration.ofSeconds(2000)).withMaxRetries(5);*/

        TestNG testng = new TestNG();
        testng.setTestSuites(Arrays.asList("testNG.xml"));
        testng.setListenerClasses(Arrays.asList(ListenerPractice.class));
       // testng.setGroups("regression");
        testng.setGroups(System.getProperty("groups"));  // value to pass mvn test -Dgroups=resression
        testng.run();
    }
}
