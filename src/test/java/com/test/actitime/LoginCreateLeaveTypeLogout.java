package com.test.actitime;

import java.io.IOException;
import org.testng.annotations.Test;
import com.generics.actitime.BaseTest;
import com.pom.actitime.CreateLeaveType;
import com.pom.actitime.HomePage;
import com.pom.actitime.LeaveTypes;

public class LoginCreateLeaveTypeLogout extends BaseTest
{
	@Test
	public void createleavetypee() throws InterruptedException, IOException
	{
		
		HomePage hom=new HomePage(driver);
		hom.Settings();
		Thread.sleep(3000);
		hom.Leavetype();
		Thread.sleep(3000);
		LeaveTypes lt=new LeaveTypes(driver);
		lt.CreateLeavetype();
		Thread.sleep(3000);
		CreateLeaveType clt=new CreateLeaveType(driver);
		clt.leavetype();
		
	}
}
