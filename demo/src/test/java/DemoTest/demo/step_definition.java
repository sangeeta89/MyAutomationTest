package DemoTest.demo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;

public class step_definition {

	
	@Given("^Login to gmail$")
	public void Login_to_gmail() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:/jars/sele_jars/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http:\\gmail.com");
	    driver.close();
	}

	@And("^some other precondition$")
	public void some_other_precondition() throws Throwable {
	    
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	    
	}
	
}
