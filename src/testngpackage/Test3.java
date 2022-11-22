package testngpackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class Test3 {
	@BeforeSuite
	public void suitee()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest 
	public void sample1()
	{
		System.out.println("beforetest");
	}
	@BeforeClass 
	public void sample3()
	{
		System.out.println("before class");
	}
	@BeforeMethod 
	public void sample4()
	{
		System.out.println("before Method");
	}
	
	@Test 
	public void sample2()
	{
		System.out.println("At test 1");
	}
	
	@Test    
	    public void test4()                      // First test case.  
	  {  
	    System.out.println("At test 2");   
	  } 
	
	@AfterSuite
	public void suitee1()
	{
		System.out.println("After Suite");
	}
	@AfterTest 
	public void sample12()
	{
		System.out.println("Aftertest");
	}
	@AfterClass 
	public void sample32()
	{
		System.out.println("After class");
	}
	@AfterMethod 
	public void sample42()
	{
		System.out.println("After Method");
	}
	
	
	  
}  