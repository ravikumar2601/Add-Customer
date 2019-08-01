package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCustomerSteps {
static WebDriver driver;
@Given("user is in telecom home page")
public void user_is_in_telecom_home_page() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\AddCustomer\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://demo.guru99.com/telecom/index.html");
    driver.manage().window().maximize();
}

@Given("user click on add customer")
public void user_click_on_add_customer() {
	 driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();    
}

@When("user is filling all the fields")
public void user_is_filling_all_the_fields() {
	
	driver.findElement(By.xpath("//label[@for='done']")).click();
    driver.findElement(By.id("fname")).sendKeys("Ravi");
    driver.findElement(By.id("lname")).sendKeys("Kumar");
    driver.findElement(By.id("email")).sendKeys("kumarravi@gmail.com");
    driver.findElement(By.name("addr")).sendKeys("Salem");
    driver.findElement(By.name("telephoneno")).sendKeys("1234567890");
}

@When("user click on submit")
public void user_click_on_submit() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("user should be displayed customer id is generate")
public void user_should_be_displayed_customer_id_is_generate() {
    Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
}


}
