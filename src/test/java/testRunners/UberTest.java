package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/appFeatures/Uber.feature"},
        glue = {"StepDefination", "MyHooks"},
        tags = "@Regression and @Smoke", //not @Smoke
        plugin = {"pretty", "json:target/MyReports/report.json", "junit:target/MyReports/report.xml"},
        publish = true
)
public class UberTest {

}
