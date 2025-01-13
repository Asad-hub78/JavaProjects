package StepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSuccess {
	WebDriver driver = Hooks.driver;
	List <String> log; 

@When("I enter the right credentials")
public void i_enter_the_right_credentials(List<String> data) {
	this.log = data;
	System.out.println(log);


}
@Then("I should be landing on the flyAway Home page {string}")
public void i_should_be_landing_on_the_fly_away_home_page(String expText) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement text = driver.findElement(By.xpath("//a[text()='Edit Profile']"));
	String actualTxt = text.getText();
	System.out.println(actualTxt);
	Assert.assertEquals(expText, actualTxt);
	


}
}
