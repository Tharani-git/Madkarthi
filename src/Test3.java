import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Test3 {

	
	 @Test  
	    public void test12()                      // First test case.  
	  {  
		 SoftAssert softAssertion= new SoftAssert(); 
		 System.out.println("softAssert Method Was Started");
			softAssertion.assertTrue(false);
			System.out.println("softAssert Method Was Executed");

	  }   
	  @Test  
	   public  void test2()                     // Second test case.  
	{  
	 System.out.println("test2");  
	 }}  