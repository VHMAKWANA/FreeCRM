package com.cra.QA.base;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class customListner extends TestBase implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		System.out.println("failed test");
		 failed(result.getMethod().getMethodName());
		
		
	}
	

}
