package testRunners;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/appFeatures/Registration.feature"},
        glue = {"StepDefination"},
        plugin = {"pretty"},
        publish = true
)
public class RegistrationTest {

}
