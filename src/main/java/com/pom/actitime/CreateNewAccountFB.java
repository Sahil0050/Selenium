package com.pom.actitime;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;

public class CreateNewAccountFB extends BasePage
{
	public WebDriver driver;
	
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
	private WebElement createnewaccountlink;
	
	@FindBy(xpath="//input[@placeholder='First name']")
	private WebElement firstnametextfield;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement surnametextfield;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement emailtextfield;
	
	@FindBy(id="password_step_input")
	private WebElement passwordtextfield;
	
	@FindBy(id="day")
	private WebElement birthday;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="(//input[@class='_8esa'])[2]")
	private WebElement maleradiobutton;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signupbutton;
	
	public CreateNewAccountFB(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void createfbaccount() throws IOException 
	{
		createnewaccountlink.click();
		firstnametextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 2));
		surnametextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 3));
		emailtextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 4));
		passwordtextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 5));
		selectbyvalue(birthday, "6");
		selectbyvalue(month, "2");
		selectbyvalue(year, "1996");
		maleradiobutton.click();
		signupbutton.click();
	}
	
}
