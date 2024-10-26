package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/appFeatures/Search.feature"},
        glue={"StepDefination" , "MyHooks"},
        plugin = {"pretty"}
)
public class AmazonTest {
}
