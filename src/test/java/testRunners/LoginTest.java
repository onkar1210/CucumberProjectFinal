package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/appFeatures/Login.feature"},
        glue = {"StepDefination"},
        plugin = {"pretty"},
        publish = true
)
public class LoginTest {
}
