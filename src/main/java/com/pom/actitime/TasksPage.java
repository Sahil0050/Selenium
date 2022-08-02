package com.pom.actitime;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage
{
	public WebDriver driver;
	
	@FindBy(id="container_tasks")
	private WebElement container_tasks;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNew;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomer;
	
	@FindBy(xpath="(//div[.='bobbydeol']/../..//div[@class='editButton'])[1]")
	private WebElement editbutton;
	
	@FindBy(xpath="(//div[.='bobbydeol'])[3]")
	private WebElement customertextfield;
	
	@FindBy(xpath="(//span[.='Write a comment...'])[1]")
	private WebElement commenttextfield;
	
	@FindBy(xpath="(//div[.='Comment'])[1]")
	private WebElement commentbutton;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private List<WebElement> searchtextfield;
	
	public TasksPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void task() throws InterruptedException
	{
		container_tasks.click();
		Thread.sleep(2000);
		AddNew.click();
		Thread.sleep(2000);
		NewCustomer.click();
	}
	
	public void editcustomer() throws InterruptedException
	{
		editbutton.click();
		Thread.sleep(2000);
		customertextfield.click();
		Thread.sleep(2000);
		customertextfield.clear();
		Thread.sleep(2000);
		customertextfield.sendKeys("Munna");
		Thread.sleep(2000);
		customertextfield.click();
		Thread.sleep(2000);
		commenttextfield.sendKeys("acha kaam");
		Thread.sleep(2000);
		commentbutton.click();
	}
	
	public void duplicate()
	{
		int count=searchtextfield.size();
		if (count>1) {
			System.out.println("duplicates are allowed");
		}
		else
		{
			System.out.println("Duplicates are not allowed");
		}
	}
}
