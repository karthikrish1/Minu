package testngwerbdr;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class i2 {
	/*
	 * 
	 * explicit wait/conditonal wait
	 * 
	 * create an object for webdriver wait 
	 * pass driver instance and time limit as input
	 * call untill mthod
	 * call conditions 
	  * 
	 * */
@Test
	public void v()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		WebDriverWait w= new WebDriverWait(ob,5);
		
		//title
		//w.until(ExpectedConditions.titleIs("yahoo")); //5
		//w.until(ExpectedConditions.titleContains("oo"));//5
		
		//alert
		//w.until(ExpectedConditions.alertIsPresent()); //5
		
		//visibility of an element
		// finding the element and checking its visibility 
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Images")));
		
		//more elements
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
		
		//element is clickable or not
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		ob.quit();
	}

}
