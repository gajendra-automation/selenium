package com.rims.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rims.utils.LaunchBaseClass;

public class Listener1 extends LaunchBaseClass implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is started...");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is executed successfully...");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		 //System.out.println("");
		 failed(result.getMethod().getMethodName());
		 System.out.println(result);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped....");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
}
