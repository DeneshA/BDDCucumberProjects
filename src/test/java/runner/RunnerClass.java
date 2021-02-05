package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "featureFiles/OpenGoogle.feature",glue = "stepDefinitions") //src/test/java/
//@CucumberOptions(features = "featureFiles/Login.feature",glue = "stepDefinitions") //src/test/java/
//@CucumberOptions(features = "featureFiles/Expressions.feature",glue = "stepDefinitions") //src/test/java/
@CucumberOptions(features = "featureFiles/LoginWithData.feature",glue = "stepDefinitions") //src/test/java/
public class RunnerClass {

    // It should combine the feature file and the step definition
    //Runner definition ( Cucumber by default support jUnit)




}
