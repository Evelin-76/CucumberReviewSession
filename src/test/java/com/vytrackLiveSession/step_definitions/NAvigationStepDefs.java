package com.vytrackLiveSession.step_definitions;

import com.vytrackLiveSession.pages.LoginPage;
import com.vytrackLiveSession.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NAvigationStepDefs {

    @And("the user enters the sales {string} with {string} information")
    public void theUserEntersTheSalesWithInformation(String username, String password) {
        new LoginPage().loginAsSaleManager();
    }

    @When("the user navigates to {string}, {string}")
    public void theUserNavigatesTo(String tabName, String moduleName) {
        new Da.navigateToModule(tabName,moduleName);
    }

    @Then("the title should be {string}")
    public void theTitleShouldBe(String arg0) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(actualTitle,"Dashboard");
    }


}
