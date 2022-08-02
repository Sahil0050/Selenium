package com.pom.actitime;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.generics.actitime.BasePage;
import com.generics.actitime.ExcelLibrary;

public class CreateATypeOfWork extends BasePage
{

	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(name="active")
	private WebElement status;
	
	@FindBy(id="billingType_setBillable")
	private WebElement billingType_setBillable;
	
	@FindBy(id="billingRate_input")
	private WebElement billingRate_input;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement button;
	
	@FindBy(xpath="//a[.='Interior Design']")
	private WebElement interiordesignworktext;
	
	

	private WebDriver driver;
	
	
	
	public CreateATypeOfWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void TypesofWork() throws InterruptedException, IOException
	{
		name.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 8));
		Thread.sleep(3000);
		selectbyvalue(status, "false");
		billingRate_input.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 9));
		clickalt(driver, submit);
		Thread.sleep(4000);
	}
	 
	public void cancel()
	{
		button.click();
	}
	
	public void editInteriorDesignwork()
	{
		interiordesignworktext.click();
	}
}

