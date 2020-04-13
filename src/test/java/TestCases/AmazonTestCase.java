package TestCases;

import org.testng.annotations.Test;


import Locators.AmazonPageFactory;
import Utilities.Methods;
import org.testng.Assert;

public class AmazonTestCase extends TestBase{
	
	@Test
	public void Search()
	{
		
		AmazonPageFactory amazonPageFactory = new AmazonPageFactory();		 
		Boolean testPass = amazonPageFactory.Search();   
		Assert.assertTrue(testPass,"Search test not pass");  
		 
	} 	
	@Test
	public void clickBook()
	{
		AmazonPageFactory amazonPageFactory = new AmazonPageFactory();
		Boolean testPass = amazonPageFactory.clickBook();  
		Assert.assertTrue(testPass,"ClickBook test not pass");    
		 
	} 
}
