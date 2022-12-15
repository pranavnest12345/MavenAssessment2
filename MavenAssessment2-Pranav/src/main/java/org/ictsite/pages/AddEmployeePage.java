package org.ictsite.pages;

import org.ictsite.utilities.PageUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddEmployeePage {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtName']")
	private WebElement Name;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtPassword']")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtEmail']")
	private WebElement eMail;
	
	@FindBy(xpath="//select[@id='ContentPlaceHolder1_drpDesignation']")
	private WebElement Designation;
	
	@FindBy(xpath="//select[@id='ContentPlaceHolder1_drpReportingTo']")
	private WebElement reportingTo;
	
	@FindBy(xpath="//select[@id='ContentPlaceHolder1_drpGroup']")
	private WebElement memberOf;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtEmployeeId']")
	private WebElement empId;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtConfirmPassword']")
	private WebElement passWord2;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtMobileNumber']")
	private WebElement Number;
	
	@FindBy(xpath="//select[@id='ContentPlaceHolder1_drpEmployeeType']")
	private WebElement empType;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_ChkReportingStaff']")
	private WebElement reportingStaff;
	
	@FindBy(xpath="//textarea[@id='ContentPlaceHolder1_txtAddress']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSubmit']")
	private WebElement submit;
	
	
	public AddEmployeePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    
    public void setName(String struserName) {
        
    	 PageUtility.sendInput(Name, struserName);
	
    }
    
    public void setPassword(String strPassword) {


        PageUtility.sendInput(passWord, strPassword);
	
    }
    
    public void setMail(String streMail) {


        PageUtility.sendInput(eMail, streMail);
	
    }
    
    public void setDesignation(String strDesignation) {


        PageUtility.sendInput(Designation, strDesignation);
	
    }
    
    public void setreportingTo(String strreportingTo) {


        PageUtility.sendInput(reportingTo, strreportingTo);
	
    }
    
    public void setmemberOf(String strmemberOf) {


        PageUtility.sendInput(memberOf, strmemberOf);
	
    }
    
    public void setempId(String strempId) {


        PageUtility.sendInput(empId, strempId);
	
    }
    
    public void setPassword2(String strPassword2) {


        PageUtility.sendInput(passWord2, strPassword2);
	
    }
    
    public void setNumber(String strNumber) {


        PageUtility.sendInput(Number, strNumber);
	
    }
    
    public void setempType(String strempType) {


        PageUtility.sendInput(empType, strempType);
	
    }
    
    public void clickreportingStaff() {
        
		PageUtility.selectChkBox(reportingStaff);
	        
	}
    
    public void setAddress(String straddress) {
        
   	 PageUtility.sendInput(address, straddress);
	
   }
 
	        
	public void clickLogin() {
	            
		PageUtility.clickBtn(driver, submit);
	        
	}
	
}
