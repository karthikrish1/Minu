package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class a1 {
	/*assertion: technique where we will be comparing actual result with obtained result
	 * 
	 * hard:   
	 *      provided by Assert builtin class
	 *      static in nature
	 *      assrtion fails=> fail the test case
	 *      
	 * soft
	 *      provided by softassert builtin class
	 *      nonstatic in nature
	 *      assertion=> it will proceed further
	 *      original result:  assertAll()
	 * 
	 * assertEquals(actual, expected)
	 * assertNotEquals(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	@Test
	public void v()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		//Assert.assertEquals(ob.getTitle(), "yahoo");
		Assert.assertNotEquals(ob.getTitle(), "yahoo");
		WebElement ele = ob.findElementByLinkText("Privacy");
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertFalse(ele.isSelected());
		ob.quit();
	}

}
