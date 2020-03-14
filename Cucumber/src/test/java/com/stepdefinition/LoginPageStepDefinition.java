package com.stepdefinition;

import java.util.List;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinition {
  static WebDriver driver;

  @Given("Has to validate the FB login page")
  public void has_to_validate_the_FB_login_page() {
	   System.setProperty("webdriver.chrome.driver","C:\\Dumbs\\java\\chromedriver_win32\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	}

  @When("User has to enter username,password and click login")
  public void user_has_to_enter_username_password_and_click_login(io.cucumber.datatable.DataTable d) {
	  List<List<String>> li = d.asLists();
	    driver.findElement(By.id("email")).sendKeys(li.get(1).get(0));
	    driver.findElement(By.id("pass")).sendKeys(li.get(0).get(1));
	    driver.findElement(By.id("loginbutton")).click();
	
	}

  @Then("User has find error message")
  public void user_has_find_error_message() {
	   Assert.assertEquals(driver.getCurrentUrl().equals(driver.getCurrentUrl()), false);	   
	
  }

	
}