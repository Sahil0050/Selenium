package com.pom.actitime;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.ExcelLibrary;

public class CreateACustomer 
{
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement CustomerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement CustomerDescription;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement SelectCustomer;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[2]/../../../../../..//div[.='Big Bang Company']")
	private WebElement BigBangCompany;
	
	@FindBy(id="copyManagers")
	private WebElement ManagerCheckbox;
	
	@FindBy(id="copyAssignedUsers")
	private WebElement AssignedUsersCheckbox;
	
	@FindBy(id="copyProjectDescription")
	private WebElement ProjectDescriptionCheckbox;
	
	@FindBy(id="copyTaskDescription")
	private WebElement TaskDescriptionCheckbox;
	
	@FindBy(id="copyTaskStatus")
	private WebElement TaskStatusCheckbox;
	
	@FindBy(id="copyTaskTypeOfWork")
	private WebElement TaskTypeOfWorkCheckbox;
	
	@FindBy(id="copyTaskEstimate")
	private WebElement copyTaskEstimateCheckbox;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement CreateCustomer;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancel;
	
	@FindBy(xpath="(//div[@class='editButton'])[17]")
	private WebElement editButton;
	
	@FindBy(xpath="(//div[.='ACTIONS'])[1]")
	private WebElement actions;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement delete;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deletepermanently;
	
	@FindBy(xpath="(//div[@class='cancelBtn greyButton'])[1]")
	private WebElement Cancel;
	
	public WebDriver driver;
	
	public CreateACustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void createcustomer() throws InterruptedException, IOException
	{
		
		CustomerName.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 6));
		Thread.sleep(2000);
		CustomerDescription.sendKeys(ExcelLibrary.getcellvalue("LoginData", 1, 7));
		Thread.sleep(2000);
		SelectCustomer.click();
		Thread.sleep(2000);
		BigBangCompany.click();
		Thread.sleep(2000);
		CreateCustomer.click();
		
	}	
}
