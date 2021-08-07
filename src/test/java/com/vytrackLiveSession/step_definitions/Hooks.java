package com.vytrackLiveSession.step_definitions;

import com.vytrackLiveSession.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){

        System.out.println("BEFORE METHOD");

        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
    @After
    public void tearDown(){
        Driver.closeDriver();
        System.out.println("AFTER METHOD");
    }
}
