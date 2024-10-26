package StepDefination;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class RegistrationSteps {
    @Given("User is on registration page")
    public void user_is_on_registration_page() {
        System.out.println("ho");
    }

    @When("User enters following details")
    public void user_enters_following_details(List<List<String>> data) {
        for(List<String> x: data){
            System.out.println(x);
        }
    }

    @When("User enters following details with column")
    public void user_enters_following_details_with_column(List<Map<String, String>> data) {
        for (Map<String, String> x: data){
            System.out.println(x);

            for (Map.Entry<String, String> e : x.entrySet()) {
                System.out.println(e.getKey() + " = " + e.getValue());
            }
        }

    }

    @Then("user registration should be successful")
    public void user_registration_should_be_successful() {

    }
}
