package com.vytrack.runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
       tags = "@login",
        plugin = {"html:target/default-report",
                  "json:target/cucumber1.json",
                  "rerun:target/rerun.txt"
        }


)
public class CucumberRunner extends AbstractTestNGCucumberTests {



}
