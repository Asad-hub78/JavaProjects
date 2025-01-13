package StepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FlightScenario {
	WebDriver driver = Hooks.driver;
	List<String>log;
	

	@When("I enter login details")
	public void i_enter_login_details(List<String>logDetail) {
		this.log = logDetail;
		System.out.println(log);
	  
	}
	@When("I click home button")
	public void i_click_home_button() {
	WebElement homeBtn = driver.findElement(By.xpath("//a[text()='Home']"));
	homeBtn.click();
		
	}
	

	@When("I select location from {string}")
	public void i_select_location_from(String args) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select location = new Select(driver.findElement(By.xpath("//select[@name='source']")));
		location.selectByVisibleText("Bangalore");
		
	    
	}

	@When("I select the destination To {string}")
	public void i_select_the_destination_to(String args) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select destination = new Select(driver.findElement(By.xpath("//select[@name='destination']")));
	      destination.selectByIndex(4);
	}
	@When("I click submit button")
	public void i_click_submit_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
		submitBtn.click();
	}

	@Then("I should be able to see flight booking option {string}")
	public void i_should_be_able_to_see_flight_booking_option(String expMsg) {
		WebElement validation1 = driver.findElement(By.xpath("//a[text()='Book Flight']"));
		String actualMsg = validation1.getText();
		System.out.println(actualMsg);
		Assert.assertEquals(expMsg, actualMsg);
	    
	}

	@When("I click flight button")
	public void i_click_flight_button() {
		WebElement flightBtn = driver.findElement(By.xpath("//a[text()='Book Flight']"));
		flightBtn.click();
	   
	}

	@When("I click complete booking")
	public void i_click_complete_booking() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement completeOption = driver.findElement(By.xpath("//a[text()='Click to complete booking']"));
		Actions action = new Actions(driver);
		action.moveToElement(completeOption).click().perform();
		completeOption.click();
	    
	}

	@When("I click your bookings")
	public void i_click_your_bookings() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement seeBookingOption = driver.findElement(By.linkText("See Your Bookings"));
		seeBookingOption.click();
	    
	}

	@Then("I should be able to see booking confirmation {string}")
	public void i_should_be_able_to_see_booking_confirmation(String string) {

}
}
