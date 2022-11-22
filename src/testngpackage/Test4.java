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


public class Test4 {
	@Test (priority=1)
	public void suitee()
	{
		System.out.println("first");
	}
	@Test (priority=2)
	public void abc()
	{
		System.out.println("second");
	}
	
		
	
	  
}  