package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinationTest {
	
	

		
		WebDriver driver;
		
		@Given("User is on google page")
		public void User_is_on_google_page() {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			
		}
		
		@When("click on search box")
		public void click_on_search_box(){
			driver.findElement(By.xpath("//textarea[@id='ti6dpd']")).click();
			
		}
		
		@And("enter the search keyword as {string}")
		public void enter_the_search_keywors_as(String word)
		{
			driver.findElement(By.xpath("//textarea[@id='ti6dpd']")).sendKeys(word);
		}
		
		@And("Then click on search button")
		public void Then_click_on_search_button() {
			driver.findElement(By.xpath("//input[@name='btnK']")).click();
		}

	}


