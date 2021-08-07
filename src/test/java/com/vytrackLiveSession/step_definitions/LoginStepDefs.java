package com.vytrackLiveSession.step_definitions;

import com.vytrackLiveSession.pages.LoginPage;
import com.vytrackLiveSession.utilities.ConfigurationReader;
import com.vytrackLiveSession.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        String loginUrl = ConfigurationReader.get("url");

    }

    @When("the user enters the driver information")
    public void theUserEntersTheDriverInformation() {
        new LoginPage().loginAsDriver();
    }

    @Then("the user sould be able to login")
    public void theUserSouldBeAbleToLogin() {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);
    }
}
