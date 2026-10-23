package testPracticeBDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookTest {

	static WebDriver driver;
	@Before
	public void setUp() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenuim\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
	@After
	public void cleanup() {
		driver.close();
	}
}

