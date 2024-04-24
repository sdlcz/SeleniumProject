package testPackage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverUtilities.DriverUtilities;



public class LoginTest {
	
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
		DriverUtilities myDriverUtilities = new DriverUtilities();
		driver = myDriverUtilities.getDriver();

	}

	@And("user is on swag labs login page")
	public void user_is_on_swag_labs_login_page() {
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {

	}



}
