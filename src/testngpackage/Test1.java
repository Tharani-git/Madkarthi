package testngpackage;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class Test1 {
	@BeforeSuite (enabled=true)   
    public void test13()                      // First test case.  
  {  
    System.out.println("test1 beforedd");   
  } 
	
	@BeforeTest (enabled=true)   
	    public void test12()                      // First test case.  
	  {  
	    System.out.println("test1 beforedd");
	   
	  }   
	  @Test  (groups= {"Include test case1"})
	   public  void test2()                     // Second test case.  
	{  
	 System.out.println("test2"); 
	 Reporter.log("We used Google Chrome Ver 86 for this test");
	 }
	  @Test  
	   public  void test3()                     // Second test case.  
	{  
	 System.out.println("test3");  
	 Reporter.log("We used Google Chrome Ver 8 for this test");
	 }	
	  @Test  
	   public  void test4()                     // Second test case.  
	{  
	 System.out.println("test3");  
	 Reporter.log("We used Google Chrome Ver 8 for this test");
	 }	
}  