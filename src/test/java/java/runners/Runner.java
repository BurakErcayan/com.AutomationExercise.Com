package java.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports.html",
                "json:target/json-reports/Pcucumber.json",
                "junit:target/xml-report/Pcucumber.xml"},
        features="src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@US024",
        dryRun =false
)
public class Runner {



}
