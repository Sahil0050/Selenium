package com.test.actitime;

import java.io.IOException;
import org.testng.annotations.Test;
import com.generics.actitime.BaseTest;
import com.pom.actitime.CreateACustomer;
import com.pom.actitime.TasksPage;

public class LoginCreateCustomerLogout extends BaseTest
{
	@Test
	public void customercreate() throws InterruptedException, IOException
	{
		TasksPage tk=new TasksPage(driver);
		tk.task();
		CreateACustomer cc=new CreateACustomer(driver);
		cc.createcustomer();
	}
}
