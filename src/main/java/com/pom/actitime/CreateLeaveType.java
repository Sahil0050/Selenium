package com.pom.actitime;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.actitime.ExcelLibrary;

	public class CreateLeaveType 
{
	
	@FindBy(xpath="//input[@placeholder='Leave Type Name']")
	private WebElement LeaveTypeName;
	
	@FindBy(xpath="//span[@class='buttonTitle']")
	private WebElement buttonTitle;
	
	@FindBy(xpath="(//div[.='Cancel'])[2]")
	private WebElement Cancel;
	
	
	private WebDriver driver;


	public CreateLeaveType(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
	
	public void leavetype() throws InterruptedException, IOException
	{
		
		LeaveTypeName.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 10));
		buttonTitle.click();
		
		
	}
	
	public void cancel()
	
	{
		Cancel.click();
	}
}
