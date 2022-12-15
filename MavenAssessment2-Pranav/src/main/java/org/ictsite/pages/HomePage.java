package org.ictsite.pages;

import org.ictsite.utilities.PageUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	WebDriver driver;
	
	@FindBy(linkText="Employee")
	private WebElement clickEmployee;
	
	@FindBy(linkText="Add Employee")
	private WebElement clickAddEmployee;
	
	@FindBy(linkText="List Employee")
	private WebElement clickListEmployee;
	
	@FindBy(linkText="Home")
	private WebElement homeClick;
	
	@FindBy(linkText="Delete")
	private WebElement deleteEmployee;
	
	@FindBy(linkText="Edit")
	private WebElement editEmployee;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 public void addEmployee(){
	    	
	    	PageUtility.hoverEg(driver, clickEmployee);
	    	PageUtility.clickBtn(driver, clickAddEmployee);
		
		}
	 public void listEmployee(){
	    	
		 PageUtility.hoverEg(driver, clickEmployee);
	    PageUtility.clickBtn(driver, clickListEmployee);
		
		}
	 
	 public void homeClick() 
	 {
		 PageUtility.clickBtn(driver, homeClick);
	 }
	 
	 
	 public void deleteEditEmpClick()
	 {
		 PageUtility.enterKey(driver);
		 PageUtility.clickBtn(driver, deleteEmployee);
		 PageUtility.alertCheck(driver);
		 PageUtility.clickBtn(driver, editEmployee);
	 }
	 
	
}
