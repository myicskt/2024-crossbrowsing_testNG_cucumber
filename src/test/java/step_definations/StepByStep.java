package step_definations;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.BrowserFactory;

public class StepByStep {
	WebDriver driver;
	private static String activebrowser;

	@BeforeTest
	@Parameters("browser")
	public void setUp(String browser) {
		activebrowser = browser;

	}
	
	@Before
	public void before() {
		driver = BrowserFactory.setBrowser(activebrowser);
		System.out.println("active browser is : "+activebrowser);
		
	}

	@Given("open the url as {string}")
	public void open_the_url_as(String url) {
		
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@When("search the keyword as {string}")
	public void search_the_keyword_as(String string) {

	}

	@Then("I validate the result")
	public void i_validate_the_result() {
		driver.quit();

	}

}
