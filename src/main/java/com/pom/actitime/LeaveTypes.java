package com.pom.actitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.actitime.BasePage;

public class LeaveTypes extends BasePage
{

	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement CreateLeaveType;
	
	@FindBy(xpath="(//span[.='Roga'])[1]")
	private WebElement Rogaleavebutton;
	
	@FindBy(xpath = "(//span[.='Roga'])[1]/..//span[@class='leaveTypeNameText']")
	private WebElement edit;
	
	@FindBy(xpath="(//span[.='Roga'])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement Delete;
	
	@FindBy(xpath="(//div[@class='applyButton'])[1]")
	private WebElement editedapplybutton;
	
	@FindBy(xpath="(//div[@class='cancelButton'])[2]")
	private WebElement editedcancelbutton;
	
	private WebDriver driver;
	
	public LeaveTypes(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void CreateLeavetype()
	{
		CreateLeaveType.click();
	}
	
	public void Delete() throws InterruptedException
	{
		Delete.click();
		alertok(driver);
		Thread.sleep(3000);
	}
	

	public void cancell()
	{
		editedcancelbutton.click();
	}
}
