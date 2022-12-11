package parallel;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.println(result.getMethod().getConstructorOrMethod().getMethod());

        System.out.println("This is invoked on start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println(result.getMethod().getConstructorOrMethod().getMethod());

        System.out.println("This is invoked on success");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println(result.getMethod().getConstructorOrMethod().getMethod());

        System.out.println("This is invoked on failure");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.println(result.getMethod().getConstructorOrMethod().getMethod());
        System.out.println("This is invoked on skipped");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
        System.out.println(result.getMethod().getConstructorOrMethod().getMethod());

        System.out.println("This is invoked on onTestFailedButWithinSuccessPercentage");

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
