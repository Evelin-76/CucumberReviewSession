package com.vytrackLiveSession.step_definitions;

import com.vytrackLiveSession.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @BeforeMethod
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
    @AfterMethod
    public void tearsDown(){
        Driver.closeDriver();}
}
