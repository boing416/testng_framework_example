package Locators;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPageFactory {
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement inputSearch;  
 
	
	public void Search()
	{
		inputSearch.sendKeys("Books");
		inputSearch.sendKeys(Keys.ENTER);  		
	}
	
	
}
