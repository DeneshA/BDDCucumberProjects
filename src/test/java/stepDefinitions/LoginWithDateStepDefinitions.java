package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithDateStepDefinitions {
    WebDriver driver;

    @Given("^user is on the login page$")
    public void user_is_on_the_login_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\IdeaProjects\\LAOProjects\\driver\\1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("^the user enters the valid credientials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_user_enters_the_valid_credientials_and(String arg1, String arg2) throws Throwable {
       driver.findElement(By.id("txtUsername")).sendKeys(arg1);
       driver.findElement(By.id("txtPassword")).sendKeys(arg2);

    }

    @When("^click  the login button$")
    public void click_the_login_button() throws Throwable {
       driver.findElement(By.id("btnLogin")).click();
    }

    @Then("^the user should see the home page$")
    public void the_user_should_see_the_home_page() throws Throwable {
     boolean findStatus = driver.findElement(By.linkText("Welcome Paul")).isDisplayed();
        Assert.assertTrue(findStatus);
    }
}
