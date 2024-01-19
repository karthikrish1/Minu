package testngdependency;

import org.testng.annotations.Test;

public class d2 {

	//dependsongroups: create connection between group and test cases
	
	
	
	
	
		@Test(priority=0,groups="A")
		public void a()
		{
			System.out.println("tc1");
		}
		
		@Test(priority=1,groups="A")
		public void b()
		{
			System.out.println("tc2");
		}
		
		@Test(priority=2,dependsOnGroups="A")
		public void c()
		{
			System.out.println("tc3");
		}

	}

	//groups: A    a, b  => both pass       c=> execute
// even 1 failed                            c=> skipped


