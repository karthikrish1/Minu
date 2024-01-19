package testngattr;

import org.testng.annotations.Test;

public class m1 {
	
	/*testng: test next generation
	 * 
	 * inspired from JUNUit
	 * testng framework
	 * annotations, attributesm suite, grouping , parallel
	 * 
	 * 
	 * test case
	 *      nonstatic
	 *      @Test
	 *      default order: alphabetical
	 *      autotmatic report generation
	 *      
	 *      priority:  arrange the test case in particular order 
	 *      description: add short note on test case 
	 *      groups 
	 *      invocationCount
	 *      disable/ignoring 
	 *      timeout 
	 * * */
	
	
	@Test(priority=0,description="FIRST",groups="K1",invocationCount=5,enabled=false)
	public void m1()
	{
		System.out.println("test case 1");
	}
	
	@Test(priority=1,groups="K1")
	public void ab()
	{
		System.out.println("test case 2");
	}
	
	@Test(priority=2,description="this is last ",groups="J")
	public void m2()
	{
		System.out.println("test case 3");
	}

}
