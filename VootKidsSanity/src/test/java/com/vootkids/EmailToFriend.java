package com.vootkids;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmailToFriend {

	@Test(priority = 11, dataProvider = "providedata")
	public void sendEmail(String email) throws IOException, InterruptedException {
		Thread.sleep(4000);
		Init.getDriver().findElement(By.id("email")).sendKeys(email);
		Init.getDriver().findElement(By.id("sendEmail")).click();
		Thread.sleep(5000);
		System.out.println("Invitation has been sent to " + email);
	}

	@DataProvider(name = "providedata")
	public Object[] passData() throws Throwable {

		// Read data from array using data-provider

		Object[] data = new Object[2];
		data[0] = "chaitanya.shastry@webdunia.net";
		Thread.sleep(4000);
		data[1] = "chanishastry1@gmail.com";
		return data;

	}
}
