package caseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario2 {
WebDriver driver;
@Given("The Browser opens the URL {string}")
public void the_Browser_opens_the_URL(String string) {
	String path = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\jar\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	driver.get(string);
	driver.manage().window().fullscreen();

}

@When("Click on login Button")
public void click_on_login_Button() {
driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
}

@When("Enter the UserName {string}")
public void enter_the_UserName(String string) {
driver.findElement(By.name("userName")).sendKeys(string);
}

@When("Enter the Password {string}")
public void enter_the_Password(String string) {
driver.findElement(By.name("password")).sendKeys(string);
}

@Then("Click on Login Button")
public void click_on_Login_Button() {
driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
}


}
