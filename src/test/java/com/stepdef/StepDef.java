package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	static WebDriver driver;

	@Given("when user in on loginpage")
	public void when_user_in_on_loginpage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String user, String pass) {
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys(user);
		WebElement element2 = driver.findElement(By.id("pass"));
		element2.sendKeys(pass);
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement element = driver.findElement(By.name("login"));
		element.click();
//		driver.quit();

	}

}
