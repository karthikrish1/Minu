package testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener
	//Onstart, onfinish, ontestsucess, ontestfailure, ontestskipped
	// class<=> interface :  implements
	// clss=> implements Interfacename
	// right click=> source=> override/implement methods
public class l1 implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		System.out.println("SUCESSS!!!!");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed");
	}

	public void onStart(ITestContext context) {
System.out.println("Started");
	}

	public void onFinish(ITestContext context) {
	System.out.println("finished");
	}
	
	

}
