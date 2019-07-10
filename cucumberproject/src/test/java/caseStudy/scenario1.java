package caseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario1 {
	
WebDriver driver;

@Given("The Browser opens the url {string}")
public void the_Browser_opens_the_url(String string) {

	String path = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get(string);
	driver.manage().window().fullscreen();
	
}

@When("Clicks login button")
public void clicks_login_button() {
	
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();

}

@When("Type in username field {string}")
public void type_in_username_field(String string) {
driver.findElement(By.name("userName")).sendKeys(string);
	
}

@When("Type in the first name {string}")
public void type_in_the_first_name(String string) {
driver.findElement(By.name("firstName")).sendKeys(string);
}

@When("Type in the last nam {string}")
public void type_in_the_last_nam(String string) {
driver.findElement(By.name("lastName")).sendKeys(string);
}

@When("Type in password field {string}")
public void type_in_password_field(String string) {
driver.findElement(By.name("password")).sendKeys(string);
}

@When("Type in confirm password {string}")
public void type_in_confirm_password(String string) {
driver.findElement(By.name("confirmPassword")).sendKeys(string);
}

@When("Select your gender")
public void select_your_gender() {
driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
}

@When("Type your email as {string}")
public void type_your_email_as(String string) {
driver.findElement(By.name("emailAddress")).sendKeys(string);
}

@When("Type the mobile number {string}")
public void type_the_mobile_number(String string) {
driver.findElement(By.name("mobileNumber")).sendKeys(string);
}

@When("Type the DOB as {string}")
public void type_the_DOB_as(String string) {
driver.findElement(By.name("dob")).sendKeys(string);
}

@When("Type the Address {string}")
public void type_the_Address(String string) {
driver.findElement(By.name("address")).sendKeys(string);
}

@When("type the security answer {string}")
public void type_the_security_answer(String string) {
driver.findElement(By.name("answer")).sendKeys(string);
}

@Then("Click on Register button and close the browser")
public void click_on_Register_button_and_close_the_browser() {
driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
driver.close();
}



}
