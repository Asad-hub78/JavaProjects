package StepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginFailure {
	WebDriver driver = Hooks.driver;
	List<String> detail; 
	@Given("when I launch the application")
	public void when_i_launch_the_application() {
	
	driver.get("http://localhost:8081/FlyAway/loginaction");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	

	@When("I enter the wrong details")
	public void i_enter_the_wrong_details(List<String> details) {
		this.detail = details;
		System.out.println(detail);
	}
	@When("I click signIn button")
	public void i_click_sign_in_button() {
			WebElement logBtn = driver.findElement(By.xpath("//button[text()='Login']"));
			logBtn.click();

}
		
		@Then("I should be shown login failure text {string}")
		public void i_should_be_shown_login_failure_text(String expText) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement validate = driver.findElement(By.partialLinkText("Login failed"));
			String actText = validate.getText();
			System.out.println(actText);
			Assert.assertEquals(expText, actText);
			
			
			
		}
}
