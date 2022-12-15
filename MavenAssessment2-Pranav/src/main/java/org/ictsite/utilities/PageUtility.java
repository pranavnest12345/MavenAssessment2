package org.ictsite.utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility {

	public static void clickBtn(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
    
	public static void sendInput(WebElement element,String input)
    {
        element.sendKeys(input);
    }
	
    public static void selectChkBox(WebElement ele) {
		
		if(!ele.isSelected())
		{
			ele.click();
		}
		
	}
    
    public static void hoverEg(WebDriver driver,WebElement element) {
		
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
    
    
    public static void enterKey(WebDriver driver)
    {
    	Actions action=new Actions(driver);
    	action.sendKeys(Keys.ARROW_DOWN);
    	action.sendKeys(Keys.ENTER);
    }
    
    public static void alertCheck(WebDriver driver)
    {
    	Alert alert=driver.switchTo().alert();
    	alert.accept();
    	
    }
   
}
