package com.CCRM.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target.rerun.txt",
                "json:target/cucumber.json",
                "junit:target/junit/junit-report.xml",
                "me.jvt.cucumber.report.PrettyReports:target.cucumber",
                "html:target/default-html-reports"
        },
        features = "src/test/resources/features",
        glue = "com/CCRM/step_definitions",
        dryRun = false,
        tags = "@1",
        publish = true
)
public class CukesRunner {
}

