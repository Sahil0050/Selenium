package com.pom.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.actitime.BasePage;

public class HomePage {
	
	@FindBy(xpath = "//a[@id='logoutLink']")
	private WebElement logoutLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement menu_icon;
	
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement TypesofWork;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement LeaveTypes;
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void logoutMethod()
	{
		BasePage bp=new BasePage();
		bp.movetoelement(driver, logoutLink);
		
	}
	
	public void Settings()
	{
		menu_icon.click();	
	}
	
	public void TypesofWork()
	{
		TypesofWork.click();
	}
	
	public void Leavetype()
	{
		LeaveTypes.click();
	}
}
