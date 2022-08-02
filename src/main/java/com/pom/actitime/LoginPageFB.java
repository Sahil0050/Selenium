package com.pom.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.ExcelLibrary;
import com.generics.actitime.Helper;

public class LoginPageFB extends Helper
{
	public WebDriver driver;
	
	@FindBy(id="email")
	private WebElement usernametextfield;
	
	@FindBy(id="pass")
	private WebElement passwordtextfield;
	
	@FindBy(xpath="//button[.='Log In']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[.='Forgotten password?']")
	private WebElement forgotpasswordlink;
	
	@FindBy(xpath="//a[.='Create New Account']")
	private WebElement createnewaccountlink;
	
	@FindBy(xpath="//a[.='Create a Page']")
	private WebElement createapagelink;
	
	public LoginPageFB(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void logintofb() throws IOException, InterruptedException
	{
		highlightelement(driver, usernametextfield);
		usernametextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 0));
		highlightelement(driver, passwordtextfield);
		passwordtextfield.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 1));
		loginbutton.click();
	}
	
	public void forgotpw()
	{
		forgotpasswordlink.click();
	}
	
	public void createnewaccount()
	{
		createnewaccountlink.click();
	}
	
	public void createpage()
	{
		createapagelink.click();
	}
}
