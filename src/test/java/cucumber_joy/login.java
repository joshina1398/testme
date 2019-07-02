package cucumber_joy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login {
WebDriver driver;
String er="Find a Flight: Mercury Tours:";
@Given("^login portal is open$")
public void login_portal_is_open() throws Throwable {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\a08019dirp_c2x.08.05\\Downloads\\chromedriver_win32\\chromedriver.exe" ); // Write code here that turns the phrase above into concrete actions
  driver=new ChromeDriver();
  driver.get("http://demoaut.com/");
  
}

@When("^username and password is entered$")
public void username_and_password_is_entered() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.name("userName")).sendKeys("mercury");
   driver.findElement(By.name("password")).sendKeys("mercury");
   driver.findElement(By.name("login")).click();
   
}

@Then("^login successful$")
public void login_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   Assert.assertEquals(er, driver.getTitle());
}



}
