package com.vootkids;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WebSanity {
	@Test(priority = 1)
	public void testWatch() throws Exception {
		Init.getDriver().get("https://www.vootkids.com/index.html#watch");
		System.out.println("Watch section is present>>PASSED");
	}

	@Test(priority = 2)
	public void testRead() throws Exception {
		Init.getDriver().get("https://www.vootkids.com/index.html#read");
		Thread.sleep(3000);
		System.out.println("Read section is present>>PASSED");
	}

	@Test(priority = 3)
	public void testListen() throws Exception {
		Init.getDriver().get("https://www.vootkids.com/index.html#listen");
		System.out.println("Listen section is present>>PASSED");
	}

	@Test(priority = 4)
	public void testLearn() throws Exception {
		Init.getDriver().get("https://www.vootkids.com/index.html#learn");
		Thread.sleep(5000);
		System.out.println("Learn section is present>>PASSED");
	}

	@Test(priority = 5)
	public void testAboutUs() throws Exception {
		Init.getDriver().findElement(By.linkText("About Us")).click();
		Thread.sleep(1000);
		System.out.println("User is Successfully navigated to the About US Page >>PASSED");
	}

	@Test(priority = 6)
	public void testContactUs() throws Exception {
		Init.getDriver().findElement(By.linkText("Contact Us")).click();
		Thread.sleep(1000);
		System.out.println("User is Successfully navigated to the Contact Us Page >>PASSED");
	}

	@Test(priority = 7)
	public void testFAQs() throws Exception {
		Init.getDriver().findElement(By.linkText("FAQs")).click();
		Thread.sleep(1000);
		System.out.println("User is Successfully navigated to the FAQs Page >>PASSED");
	}

	@Test(priority = 8)
	public void testPrivacyPolicy() throws Exception {
		Init.getDriver().findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(1000);
		System.out.println("User is Successfully navigated to the Privacy Policy Page >>PASSED");
	}

	@Test(priority = 9)
	public void testTermsConditions() throws Exception {
		Init.getDriver().findElement(By.linkText("Terms & Conditions")).click();
		Thread.sleep(1000);
		System.out.println("User is Successfully navigated to the Terms & Conditions Page >>PASSED");
	}

	@Test(priority = 10)
	public void testNavigateHome() throws Exception {
		Init.getDriver().get("https://www.vootkids.com");
		Thread.sleep(1000);
		System.out.println("User is back to Home >>PASSED");
	}
}