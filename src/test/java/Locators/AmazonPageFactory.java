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
    private By book = By.xpath("(//span[@class='a-truncate-cut' and contains(text(),'School Zone')])[1]/ancestor::a");  
    //(//span[@class='a-truncate-cut' and contains(text(),"School Zone")])[1]/ancestor::a
    //(//span[@class='a-truncate-cut' and contains(text(),'School Zone')])[1] 
 
	
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
		System.out.println("STEP 1");
		WebElement elementBook = Methods.ExplicitWaitClickable(book, 15);
		System.out.println("STEP 2"); 
		elementBook.click();  
		//Methods.clickByRobot(elementBook, false, true);   
		System.out.println("STEP 3");
		testPass = true;
		return testPass;		 	    
	}
	
	
}
