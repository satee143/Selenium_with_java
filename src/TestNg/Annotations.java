package TestNg;

import org.testng.annotations.*;

public class Annotations {
	@Test
	@BeforeClass
	void m1()
	{
<<<<<<< HEAD
		System.out.println("Method 1 edited in eclipse");
=======
		System.out.println("Method 1 edited in browser");
>>>>>>> branch 'master' of https://github.com/satee143/Selenium_with_java.git
		
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
