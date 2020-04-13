package TestCases;

import org.testng.annotations.Test;

import Locators.AmazonPageFactory;

public class AmazonTestCase extends TestBase{
	
	@Test
	public void Search()
	{
		AmazonPageFactory amazonPageFactory = new AmazonPageFactory();
		amazonPageFactory.Search();  
		 
	} 
}
