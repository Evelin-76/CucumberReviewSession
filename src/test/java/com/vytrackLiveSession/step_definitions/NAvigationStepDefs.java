package com.vytrackLiveSession.step_definitions;

import com.vytrackLiveSession.pages.DashboardPage;
import com.vytrackLiveSession.pages.LoginPage;
import com.vytrackLiveSession.utilities.BrowserUtils;
import com.vytrackLiveSession.utilities.ConfigurationReader;
import com.vytrackLiveSession.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NAvigationStepDefs {


    @And("the user enters the sales {string} with {string} information")
    public void theUserEntersTheSalesWithInformation(String username, String password) {
        BrowserUtils.waitFor(2);
        new LoginPage().login(username,password);
    }

    @When("the user navigates to {string}, {string}")
    public void theUserNavigatesTo(String tabName, String moduleName) {
        new DashboardPage().navigateToModule(tabName,moduleName);
        new DashboardPage().waitUntilLoaderScreenDisappear();
    }

    @Then("the title should be {string}")
    public void theTitleShouldBe(String arg0) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle,"Car - Entities - System - Car - Entities - System");
    }


}
