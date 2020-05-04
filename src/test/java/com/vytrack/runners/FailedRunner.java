package com.vytrack.runners;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "@target/rerun.txt",

        plugin = {"html:target/failed-default-report",
                "json:target/failed_report.json"

        }


)
public class FailedRunner extends AbstractTestNGCucumberTests {

}
