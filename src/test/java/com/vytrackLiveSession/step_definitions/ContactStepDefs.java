package com.vytrackLiveSession.step_definitions;

import com.vytrackLiveSession.pages.ContactInfoPage;
import com.vytrackLiveSession.pages.ContactPage;
import com.vytrackLiveSession.pages.DashboardPage;
import com.vytrackLiveSession.utilities.BrowserUtils;
import com.vytrackLiveSession.utilities.DBUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class ContactStepDefs {

    @And("user navigate to {string} {string}")
    public void userNavigateTo(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
    }

    @When("the user clicks the {string} from contacts")
    public void theUserClicksTheFromContacts(String email) {
        BrowserUtils.waitFor(5);
        ContactPage contactsPage = new ContactPage();
        contactsPage.getContactEmail(email).click();
    }

    @Then("the information should be same with database")
    public void theInformationShouldBeSameWithDatabase() {
        BrowserUtils.waitFor(3);
        //get info from UI
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        String actualfullName = contactInfoPage.fullName.getText();
        String actualEmail = contactInfoPage.email.getText();
        String actualPhoneNumber = contactInfoPage.phoneNumber.getText();

        System.out.println("Actual full name " + actualfullName);
        System.out.println("Actual phone " + actualPhoneNumber);
        System.out.println("Actual email " + actualEmail);

        //get info from DB:
        //getting one row (copied and pasted from MySQL query)
        String query =
                "SELECT CONCAT(FIRST_NAME,' ',LAST_NAME) AS \"full name\", E.EMAIL, PHONE " +
                        "FROM OROCRM_CONTACT C "+
                        "JOIN OROCRM_CONTACT_EMAIL E "+
                        "ON C.ID = E.OWNER_ID "+
                        "JOIN OROCRM_CONTACT_PHONE P "+
                        "ON C.ID = P.OWNER_ID "+
                        "WHERE E.EMAIL = 'mbrackstone9@example.com'";

        Map<String,Object> rowMap = DBUtils.getRowMap(query);
        String expectedFullName = (String) rowMap.get("full name");
        String expectedPhone = (String) rowMap.get("phone");
        String expectedEmail = (String) rowMap.get("email");
        System.out.println("Expected full name " + expectedFullName);
        System.out.println("Expected phone " + expectedPhone);
        System.out.println("Expected email " + expectedEmail);

        //assertion
        Assert.assertEquals(actualfullName,expectedFullName);
        Assert.assertEquals(actualEmail,expectedEmail);
        Assert.assertEquals(actualPhoneNumber,expectedPhone);
    }
}
