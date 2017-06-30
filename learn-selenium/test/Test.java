package com.obernardovieira.solotest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	@Test
	public void testLogin() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("file:///(...)");

		Thread.sleep(1000);

		WebElement username = driver.findElementByName("username");
		username.sendKeys("admin");
		WebElement password = driver.findElementByName("password");
		password.sendKeys("admin");
		WebElement button_login = driver.findElementByCssSelector("input[type=submit]");
		button_login.submit();

		Thread.sleep(4000);

		String idade = driver.findElementById("idade").getText();
		if (!idade.equals("15")) {
			driver.quit();
			assertTrue(false);
		} else {
			driver.quit();
		}
	}

}
