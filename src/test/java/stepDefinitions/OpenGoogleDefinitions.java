package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleDefinitions {
    WebDriver driver;

    @Given("^User is entering Google\\.com$")
    public void user_is_entering_Google_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\IdeaProjects\\LAOProjects\\driver\\1\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @When("^user is typing the search term \"([^\"]*)\"$")
    public void user_is_typing_the_search_term(String searchText) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(searchText);
    }

    @When("^enters the return key$")
    public void enters_the_return_key() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @Then("^the user should see the search results$")
    public void the_user_should_see_the_search_results() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean status = driver.findElement(By.partialLinkText("Automation Online")).isDisplayed();
        if (status){
            System.out.println("Results Displayed");
        }
    }
}
