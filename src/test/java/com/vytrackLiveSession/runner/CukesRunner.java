package com.vytrackLiveSession.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                 glue = "com/vytrackLiveSession/step_definitions",

                 plugin = {"json:target/cucumber.json",
                           "html:target/default-html-reports" },
                 dryRun = false,
                 tags = "@db"
            )

public class CukesRunner {
}
