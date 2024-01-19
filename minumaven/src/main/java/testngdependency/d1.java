package testngdependency;

import org.testng.annotations.Test;

public class d1 {
	
	//dependsOnMethods: create connection between test cases
	
	
	@Test(priority=0)
	public void visiting()
	{
		System.out.println("visiting");
	}
	
	@Test(priority=1, dependsOnMethods="visiting")
	public void lg()
	{
		System.out.println("login");
	}

}

//visiting: pass   lg: execute
//visiting: fail   lg: skipping
