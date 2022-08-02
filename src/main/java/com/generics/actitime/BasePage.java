package com.generics.actitime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public void gettitle(WebDriver driver)
	{
		System.out.println(driver.getTitle());
	}
	
	public void selectbyvisibletext(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
		
	}
	public void selectbyindex(WebElement ele1, int x)
	{
		Select sel1=new Select(ele1);
		sel1.selectByIndex(x);
	}
	
	public void selectbyvalue(WebElement ele2, String text1)
	{
		Select sel2=new Select(ele2);
		sel2.selectByValue(text1);
		
	}
	
	public void movetoelement(WebDriver driver , WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void clickalt(WebDriver driver , WebElement ele2)
	{
		Actions act1=new Actions(driver);
		act1.click(ele2).perform();
	}
	
	public void robottab() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void alertok(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	
	public void alertcancel(WebDriver driver)
	{
		Alert alt1=driver.switchTo().alert();
		alt1.dismiss();
	}
	
	public void alerttext(WebDriver driver)
	{
		Alert alt2=driver.switchTo().alert();
		alt2.getText();
	}
	
	public void javascriptclick(WebDriver driver,WebElement el)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguements[0].click()", el);
	}
	
}
