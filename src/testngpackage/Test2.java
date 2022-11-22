package testngpackage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class Test2 {

	
	@Test (groups= {"Paithiyam KArthi1"})     
	    public void test4()                      // First test case.  
	  {  
	    System.out.println("Paithiyam KArthi1");   
	  }   
	  @Test  (groups= {"mad KArthi2"})
	   public  void test5()                     // Second test case.  
	{  
	 System.out.println("Paithiyam KArthi2");  
	 }
	  @Test  (groups= {" Worst Giri"}) 
	   public  void test6()                     // Second test case.  
	{  
	 System.out.println("test6");  
	 }	  
}  