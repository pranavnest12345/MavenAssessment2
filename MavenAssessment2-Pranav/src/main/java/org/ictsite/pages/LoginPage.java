package org.ictsite.pages;

import org.ictsite.utilities.PageUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	WebDriver driver;

	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@id='btnSubmit']")
	private WebElement loGin;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

    
    public void setUserName(String struserName) {
        
    	 PageUtility.sendInput(userName, struserName);
	
    }
    
    public void setPassword(String strPassword) {


        PageUtility.sendInput(passWord, strPassword);
	
    }
  
	        
	public void clickLogin() {
	            
		PageUtility.clickBtn(driver, loGin);
		
	        
	}
	
}
