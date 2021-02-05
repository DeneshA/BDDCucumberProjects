package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class ExpressionsSetpDefinitions {

    //    @Given("^I have (\\d+) laptop&")
//    public void i_have_lapton(int arg1) throws  Throwable {
//        System.out.println("I have "+arg1+"laptop");
//    }
    @Given("^: I have (\\d+) laptop$")
    public void i_have_laptop(int arg1) throws Throwable {
        System.out.println("I have " + arg1 + " laptop");
        //throw new PendingException();
    }

    // \d+  --> integer value
    @Given("^: I have a (\\d+\\.\\d+) CGPA$")
    public void i_have_a_CGPA(int arg2) throws Throwable {
        System.out.println("I have a " + arg2 + " CGPA");
    }
    // (.*?) --> string value also alternative \"([^\"]*)\" you can represent the string
    // /"(.*?)\" -->  adding string expression in double quotes

    @Given("^: \"([^\"]*)\" is older to \"([^\"]*)\" and \"([^\"]*)\"$")
    public void is_older_to_and(String arg3, String arg4, String arg5) throws Throwable {
        System.out.println(arg3 + " is older to " + arg4 + " and " + arg5);

    }
}