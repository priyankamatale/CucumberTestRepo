package testPracticeBDD;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinationLogin {
	//WebDriver driver;
	@Given("User is on Login page")
	public void User_is_on_Login_page() throws Exception {
		
		//System.setProperty("webdriver.chrome.driver","D:\\Selenuim\\chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.manage().window().maximize();
		HookTest.driver.get("https://opensource-demo.orangehrmlive.com/");
		//Thread.sleep(3000);
		
		
		
	}
	
	@When("user enter username {string}")
	public void user_enter_usernam(String username) {
		
		
		WebDriverWait wait=new WebDriverWait(HookTest.driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		HookTest.driver.findElement(By.name("username")).sendKeys(username);
		
		
	}
	
	@And("user enter password {string}")
	public void user_enter_password(String password) {
		HookTest.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}
	
	
	@And("click on Login button")
	public void click_on_Login_button() {
		HookTest.driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	
}
