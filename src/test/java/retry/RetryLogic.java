package retry;

import com.sun.net.httpserver.Authenticator;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryLogic implements IRetryAnalyzer {
    int count=0, maxCount=3;

    @Override
    public boolean retry(ITestResult result) {
        if(!result.isSuccess()){
            if(count<maxCount){
                count++;
                result.setStatus(ITestResult.FAILURE);
                return true;
            }
            else {
                result.setStatus(ITestResult.FAILURE);
                return false;
            }
        }

        return false;
    }
}
