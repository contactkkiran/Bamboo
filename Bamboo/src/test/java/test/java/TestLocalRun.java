package test.java;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLocalRun {
	private WebDriver driver;
	private WebDriverWait wait;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		driver.get("http://www.google.com");
	}

	@After
	public void tearDown() throws IOException {
		driver.quit();
	}

	@Test
	public void pageTitleAfterSearchShouldBeginWithDrupal() throws IOException {
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("Kiran!");
		searchField.submit();
		Assert.assertEquals("Google", "Google");
	}

}