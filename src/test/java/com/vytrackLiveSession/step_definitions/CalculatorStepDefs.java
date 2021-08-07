package com.vytrackLiveSession.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefs {
    @Given("I have calculator app open")
    public void iHaveCalulatorAppOpen() {
        System.out.println("Running step: I have calculator app open");
    }

    @When("I add {int} to {int}")
    public void iAddTo(int arg0, int arg1) {
        System.out.println("Running step: I add two numbers");
        System.out.println(arg0 + "+" + arg1);
    }

    @Then("I should get {int}")
    public void iShouldGet(int arg0) {
        System.out.println("Running step: verifyng the result");
        System.out.println("result is " + arg0);
    }
}
