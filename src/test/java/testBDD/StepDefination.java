package testBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	//WebDriver driver;
	//@Given("user is on the login page")
	//public void userIsOnTheLoginPage() {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
	    //System.out.println("User is on login page");
	//}

	@When("I enter username as {string}")
	public void userEntersValidUsername(String username) {
		Hooks.driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	    System.out.println("Entering username and password");
	}
	@When("I enter password as {string}")
	public void userEntersValidPassword(String password) {
		Hooks.driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
	    System.out.println("Entering  password");
	}
	@When("user clicks on login button")
	public void userClicksOnLoginButton() {
	    System.out.println("Clicking login button");
	}
	@Then("user should not be logged in")
	public void user_should_not_be_logged_in() {
	    System.out.println("user should not be able to login");
	}
	@Then("user should be logged in successfully")
	public void userShouldBeLoggedInSuccessfully() {
	    System.out.println("Login successful");
	}
}
