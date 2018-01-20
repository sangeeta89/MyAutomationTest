package DemoTest.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon_stepdef {
	public static WebDriver driver;
	
	@Given("^Login to Amazon$")
	public void login_to_Amazon() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:/jars/sele_jars/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("http:\\www.amazon.com");
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='nav-tools']//a[2]//span[2]//span")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	}
	
	@When("^Enter Credentials$")
	public void enter_Credentials() throws Throwable {
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("sngtsn64@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("kutti28");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	}
	@Then("^Successfully Logged In$")
	public void successfully_Logged_In() throws Throwable {
		System.out.println("Successfully Logged in");
		
		driver.quit();
	}
			
}
