package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {

    WebDriver driver;

//    @Given("^user is on login page&")
//    public void user_is_on_login_page(){
//
//    }
    @Given("^user is on login page$")
    public void user_is_on_login_page()throws Throwable
    {

        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\IdeaProjects\\LAOProjects\\driver\\1\\chromedriver.exe");
        driver = new ChromeDriver() ;
        driver.get("https://opensource-demo.orangehrmlive.com/");

}

    @When("^the user enters the valid username and password$")
    public void the_user_enters_the_valid_username_and_password()  {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }

    @When("^click on the login button$")
    public void click_on_the_login_button()  {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.id("btnLogin")).click();
    }

    @Then("^the user should be navigated to home page$")
    public void the_user_should_be_navigated_to_home_page()  {
        // Write code here that turns the phrase above into concrete actions
        boolean linkStatus =   driver.findElement(By.linkText("Welcome James")).isDisplayed();
        Assert.assertTrue(linkStatus);
    }


}
