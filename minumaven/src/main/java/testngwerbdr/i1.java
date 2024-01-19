package testngwerbdr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class i1 {
	/*
	 * 
	 *testng waits/webriver synchronisation technique
	 *
	 * conditional   : explicit wait 
	 * unconditional : implciit wait
	 * 
	 * once it is declared all the code which is present after it will take the time limit
	 * 
	 * code is correct: executes within time limit, it wll not wait for completion of time limit, it will proceed further
	 * code is wrong:  it will wait for the completion of time limit, then it throws up error
 * 
	 * */
@Test
	public void v()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		ob.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(ob.getTitle());//10
		System.out.println(ob.getCurrentUrl());//10
		ob.navigate().refresh();//10
		ob.findElementByLinkText("kavin"); //10
		ob.quit();//10
		
	}
}
