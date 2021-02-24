package com.bridgelabz.listener;

import com.bridgelabz.util.Utility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static com.bridgelabz.base.Base.driver;


public class ListenerTest implements ITestListener {

    @Override
    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        System.out.println(arg0.getName());
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        System.out.println("The name of the testcase Skipped is :" + arg0.getName());
        Utility utility = new Utility();
        try {
            utility.capture(driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestStart(ITestResult arg0) {
        System.out.println(arg0.getName() + " test case started");
        Utility utility = new Utility();
        try {
            utility.capture(driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("The name of the testcase passed is :" + arg0.getName());
        Utility utility = new Utility();
        try {
            utility.capture(driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
