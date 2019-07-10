package caseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class scenario4 {
WebDriver driver;
@Given("User is registered to TestMeApp")
public void user_is_registered_to_TestMeApp() {
	String path = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().fullscreen();
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Lalitha");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
}

@When("User search for headphone")
public void user_search_for_headphone() {
driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Headphone");
driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

@When("User try to proceed to payment without adding to cart")
public void user_try_to_proceed_to_payment_without_adding_to_cart() {
	

}

@Then("TestMeApp doesn't display the cart icon")
public void testmeapp_doesn_t_display_the_cart_icon() {

}

}
