package TestNg;

import org.testng.annotations.*;

public class Annotations {
	@Test
	@BeforeClass
	void m1()
	{

		System.out.println("Method 1 edited in eclipse");

		System.out.println("Method 1 edited in browser");
	}
	@BeforeMethod
	void m2()
	{
		System.out.println("Method 2 updated");
		
	}
	@BeforeTest
	void m3()
	{
		System.out.println("Mehtod 3 update in eclipse");
		
	}

}
