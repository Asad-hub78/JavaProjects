package StepDefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Hooks {
	public static WebDriver driver;
	public static ExtentReports reports = new ExtentReports("HtmlResults.html", false);
	public static ExtentTest test;

	@Before
	public void beforeTest(Scenario scenario) {
		driver = new ChromeDriver();
		test = reports.startTest(scenario.getName());
	
		
		
	}
	@After
	public void closeBrowser() {
driver.close();
reports.endTest(test);
reports.close();

}
}