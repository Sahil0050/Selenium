package com.test.actitime;

import java.io.IOException;
import org.testng.annotations.Test;
import com.generics.actitime.BaseTest1;
import com.pom.actitime.CreateNewAccountFB;
import com.pom.actitime.LoginPageFB;

public class NewFacebookAccount extends BaseTest1
{
	@Test
	public void newfb() throws IOException
	{
		LoginPageFB lfb=new LoginPageFB(driver);
		lfb.createnewaccount();
		CreateNewAccountFB fb=new CreateNewAccountFB(driver);
		fb.createfbaccount();
	}
}

