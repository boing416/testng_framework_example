package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Driver;
import Utilities.Methods;

public class AmazonPageFactory {
	
	
	private By inputSearch = By.xpath("//input[@id='twotabsearchtextbox']");  
	private By blockBestSellersInBooks = By.xpath("//span[contains(@class,'acswidget-carousel__title') and (contains(text(),'Best sellers in Books'))]");  
  

	
	public Boolean Search()
	{		 
		Boolean testPass = false;	 	 
		WebElement element = Methods.ExplicitWaitClickable(inputSearch, 15); 
		element.sendKeys("Books");  
		element.sendKeys(Keys.ENTER);
		testPass = true;	
		return testPass; 
		
	}
	
	public Boolean clickBook() 
	{	 
		Boolean testPass = false;	 	
		WebElement element = Methods.ExplicitWaitClickable(blockBestSellersInBooks, 15);
		Methods.scrollToElement(Driver.getDriver().findElement(blockBestSellersInBooks)); 
		testPass = true;
		return testPass;			    
	}
	
	
}
