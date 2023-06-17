package com.virgingames.demo.steps;

import com.virgingames.demo.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginTestSteps {

    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^user is on Home Page$")
    public void userIsOnHomePage() {
    }

    @Then("^I should see the message$")
    public void iShouldSeeTheMessage() {
        String expectedMessage = "Welcome to Virgin Games";
        String actualMessage = new HomePage().verifyWelcomeText();
        Assert.assertEquals("Message is not visible",expectedMessage, actualMessage);
    }


    @Given("^I enter url in the browser$")
    public void iEnterUrlInTheBrowser() {
    }
}
