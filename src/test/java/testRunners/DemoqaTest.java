package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/appFeatures/Demoqa.feature"},
        glue = {"StepDefination"},
        plugin = {"pretty"}
)
public class DemoqaTest {
}
