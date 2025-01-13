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

public class Signup {
	WebDriver driver = Hooks.driver; 
	Map<String,String> tab;
	@Given("I am on home page")
	public void i_am_on_home_page() {
		driver.get("http://localhost:8081/FlyAway");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));    
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		WebElement clickLoginBtn = driver.findElement(By.xpath("//a[text()='Login/Signup']"));
		clickLoginBtn.click();
	}

	@When("I click on signUp button")
	public void i_click_on_sign_up_button() {
		WebElement clickSignUpBtn = driver.findElement(By.linkText("Not a member? Signup"));
		clickSignUpBtn.click();
	    
	}

	@Then("I should be landing on the Registration page {string}")
	public void i_should_be_landing_on_the_registration_page(String expMsg) {
	
		WebElement validation = driver.findElement(By.tagName("h3"));
		String actMsg = validation.getText();
		System.out.println(actMsg);
		Assert.assertEquals(expMsg, actMsg);
		
		
	    
	}

	@Then("I enter the required details")
	public void i_enter_the_required_details(Map<String,String> details) {
		this.tab= details;
		System.out.println(tab);
	    
	}

	@Then("I click on Signup button")
	public void i_click_on_signup_button() {
		WebElement signUpBtn = driver.findElement(By.xpath("//button[text()='Signup']"));
		signUpBtn.click();
	   
	}

	@Then("I should be redirected to appropriate page")
	public void i_should_be_redirected_to_appropriate_page() {
		WebElement text = driver.findElement(By.xpath("//a[text()='Home']"));
		System.out.println(text);
		Assert.assertTrue(text.isDisplayed());
	    
	}



}
