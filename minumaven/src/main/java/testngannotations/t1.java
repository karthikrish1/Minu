package testngannotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class t1 {
	
	/*
	 * before test :   run only once before all the test cases started its execution
	 * after test :    run after all the test cses finished its execution
	 * 
	 * before class:    run only once after before test
	 * after class:     run pnly once before after test 
	 * 
	 * before method:  before each test case
	 * after method:   after each test case 
	 * 
	 * before test      : visiting
	 *    before class  : max
	 *          before method : refres  tc1 : title   aftermethod: deleting cookies
	 *          before method : refresh  tc2 : click   aftermethod: ddeleting cookies
	 *    after class : get url
	 * after test : closing 
	 * 
* 
	 * */
	ChromeDriver ob;
	@Test(priority=0)
	public void t1()
	{
		System.out.println("test case 1" + ob.getTitle());
	}
	
	@Test(priority=1)
	public void t2()
	{
		System.out.println("test case 2");
		ob.findElementByLinkText("Privacy").click();
	}

	@BeforeTest
	public void bt()
	{
		System.out.println("before tst");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("after tst");
		ob.quit();
	}
	
	@BeforeClass
	public void btc()
	{
		System.out.println("before class");
		ob.manage().window().maximize();
	}
	
	@AfterClass
	public void atc()
	{
		System.out.println("after class");
		System.out.println(ob.getCurrentUrl());
	}
	
	@BeforeMethod
	public void btm()
	{
		System.out.println("before method");
		ob.navigate().refresh();
	}
	
	@AfterMethod
	public void atm()
	{
		System.out.println("after method");
		ob.manage().deleteAllCookies();
	}
}
