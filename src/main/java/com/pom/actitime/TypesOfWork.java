package com.pom.actitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesOfWork
{
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement CreateTypeofWork; 
	
	@FindBy(xpath="//a[.='Interior Design']/..//..//a[contains(text(),'delete')]")
	private WebElement delete;
	
	@FindBy(xpath="//a[.='Interior Design']")
	private WebElement interiordesign;
	
	private WebDriver driver;
	
	public TypesOfWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void typesofwork()
	{
		CreateTypeofWork.click();
	}
	
	public void delete() throws InterruptedException
	{
		delete.click();
		Thread.sleep(2000);
		
	}
	
	public void edit()
	{
		interiordesign.click();
	}
}
