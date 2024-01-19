package testngdependency;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class d33 {
	ChromeDriver ob;
	@Test(priority=0,description="visiting google",groups="I")
	public void v()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ob= new ChromeDriver();
		ob.get("http://www.google.com");
	}
	
	@Test(priority=1,description="maximising google",groups="I")
	public void max()
	{
		ob.manage().window().maximize();
	}
	
	@Test(priority=2,description="refreshing google",invocationCount=3,groups="I")
	public void refresh()
	{
		ob.navigate().refresh();
	}
	
	@Test(priority=3,description="clicking on images",dependsOnGroups="I")
	public void clicking()
	{
		ob.findElementByLinkText("Images").click();
	}
	
	@Test(priority=4,description="closing google",dependsOnGroups="I",timeOut=3000)
	public void closing() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.quit();
	}

}
