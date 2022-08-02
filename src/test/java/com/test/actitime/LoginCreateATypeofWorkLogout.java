package com.test.actitime;

import java.io.IOException;
import org.testng.annotations.Test;
import com.generics.actitime.BaseTest;
import com.pom.actitime.CreateATypeOfWork;
import com.pom.actitime.HomePage;
import com.pom.actitime.TypesOfWork;



public class LoginCreateATypeofWorkLogout extends BaseTest
{
	@Test
	public void creatework() throws InterruptedException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.Settings();
		hp.TypesofWork();
		
		TypesOfWork tw=new TypesOfWork(driver);
		tw.typesofwork();
		
		CreateATypeOfWork ctw=new CreateATypeOfWork(driver);
		ctw.TypesofWork();
	}
}
