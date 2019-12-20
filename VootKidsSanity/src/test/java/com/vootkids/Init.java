package com.vootkids;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Init {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.vootkids.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		driver.quit();
	}
}
