package caseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario3 {
	WebDriver driver;
	@Given("URL for the website is {string}")
	public void url_for_the_website_is(String string) {
		String path = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get(string);
		driver.manage().window().fullscreen();
		
	}

	@When("Click on SignIN button")
	public void click_on_SignIN_button() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("Give user name as {string}")
	public void give_user_name_as(String string) {
	driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("Give password as {string}")
	public void give_password_as(String string) {
	driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("click on login button")
	public void click_on_login_button() {
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("Search for {string} and click on Search")
	public void search_for_and_click_on_Search(String string) {
	driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("Click on add to cart")
	public void click_on_add_to_cart() {
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@When("open cart and click on Checkout")
	public void open_cart_and_click_on_Checkout() {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	}

	@When("click on proceed to pay")
	public void click_on_proceed_to_pay() {
	driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	}

	@Then("Complete payment and exit")
	public void complete_payment_and_exit() throws InterruptedException {
		Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
	driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	driver.findElement(By.name("username")).sendKeys("123456");
	driver.findElement(By.name("password")).sendKeys("Pass@456");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[1]")).click();
	driver.quit();
	}

}
