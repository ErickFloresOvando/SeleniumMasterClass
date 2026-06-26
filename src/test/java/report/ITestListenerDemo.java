package report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerDemo implements ITestListener {

    public void onTestStart(ITestResult result){
            ExtentReportUtils.createTest(result.getMethod().getMethodName());

    }

    public void onFinish(ITestContext context){
            ExtentReportUtils.flushReport();
    }

}
