package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
    @Given("User wants to select a car type {string} from uber app")
    public void userWantsToSelectACarTypeFromUberApp(String arg0) {
        System.out.println("Step 1");
    }

    @When("User selects car {string} and pick up point {string} and drop location {string}")
    public void userSelectsCarAndPickUpPointAndDropLocation(String arg0, String arg1, String arg2) {
        System.out.println("Step 2");
    }

    @Then("Driver starts the journey")
    public void driverStartsTheJourney() {
        System.out.println("Step 3");
    }

    @And("Driver ends the journey")
    public void driverEndsTheJourney() {
        System.out.println("Step 4");
    }

    @Then("User pays {int} USD")
    public void userPaysUSD(int arg0) {
        System.out.println("Step 5");
    }

}
