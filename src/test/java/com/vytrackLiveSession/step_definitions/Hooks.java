package com.vytrackLiveSession.step_definitions;

import com.vytrackLiveSession.utilities.DBUtils;
import com.vytrackLiveSession.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before()
    public void setUp(){

        System.out.println("BEFORE METHOD");

        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ( (TakesScreenshot)Driver.get() ).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", "screenshot");
        }
        Driver.closeDriver();

    }
    @Before("@db")
    public void setUpdb(){
        System.out.println("DataBase conection in BEFORE method");
        //create conex
        DBUtils.createConnection();
    }
    @After("@db")
    public void tearDowndb() {
        System.out.println("DataBAse conection in AFTER method");
        //close conex
        DBUtils.destroy();
    }
//    @Before("@calculator")
//    public void setUpCalculator(){
//        System.out.println("Running @Before code only scenario with @calculator tag");
//    }
//
//    @After("@calculator")
//    public void tearDownCalculator(){
//        System.out.println("Running @After code only scenario with @calculator tag");
//    }
}
