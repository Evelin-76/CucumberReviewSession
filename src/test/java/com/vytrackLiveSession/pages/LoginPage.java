package com.vytrackLiveSession.pages;

import com.vytrackLiveSession.utilities.ConfigurationReader;
import com.vytrackLiveSession.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {//WE CREATE HERE THE WAIT TO MANAGE, UPDATE AND MAINTAINED
    // OUR LOCATORS IF NECESSARY

    public LoginPage(){

        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "prependedInput")
    public WebElement usernameInput;
    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;
    @FindBy (id = "_submit")
    public WebElement loginButton;

    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void loginAsDriver(){
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
    public void loginAsStoreManager(){
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
    public void loginAsSaleManager(){
        String username = ConfigurationReader.get("salemanager_username");
        String password = ConfigurationReader.get("salemanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
