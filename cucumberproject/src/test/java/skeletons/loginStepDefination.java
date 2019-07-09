package skeletons;

//import java.util.List;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class loginStepDefination {
	WebDriver driver;
	
	@Given("URL of test me app {string}")
	public void url_of_test_me_app(String string) {

		String path = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get(string);
		driver.manage().window().fullscreen();

}

	@When("On home page click sign up")
	public void on_home_page_click_sign_up() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		
}

	@When("Enter {string} as username")
	public void enter_as_username(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
		
}

	@When("Enter {string} as first name")
	public void enter_as_first_name(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);
}

	@When("Enter {string} as last name")
	public void enter_as_last_name(String string) {
		driver.findElement(By.name("lastName")).sendKeys(string);
}

	@When("Enter {string} as password")
	public void enter_as_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
}

	@When("Enter {string} as Confirm password")
	public void enter_as_Confirm_password(String string) {
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(string);
}

	@When("Enter Gender as male")
	public void enter_Gender_as_male() {
		driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
}

	@When("Enter email as {string}")
	public void enter_email_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(string);
}

	@When("Enter Mobile no as{string}")
	public void enter_Mobile_no_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(string);
}

	@When("Enter {string} as Birth date")
	public void enter_as_Birth_date(String string) {
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(string);
}

	@When("Enter {string} as Address")
	public void enter_as_Address(String string) {
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(string);
}

	@When("Enter {string} as answer to sequrity question")
	public void enter_as_answer_to_sequrity_question(String string) {
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(string);
	}

	@Then("click on Register button")
	public void click_on_Register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		driver.quit();
}


}
