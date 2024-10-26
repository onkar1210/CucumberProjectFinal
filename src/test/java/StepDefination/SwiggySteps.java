package StepDefination;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwiggySteps {
    @Given("I have food search field on page")
    public void i_have_food_search_field_on_page() {
        // Write code here that turns the phrase above into concrete
        System.out.println("I have food search field on page");
    }

    @When("I search {string}")
    public void i_search(String string) {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("I search" + string);
    }

    @Then("All the {string} optins are listed")
    public void all_the_optins_are_listed(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("All the" + string + "optins are listed");
    }

    @Given("I have a restaurant search field on Page")
    public void i_have_a_restaurant_search_field_on_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I have a restaurant search field on Page");
    }

    @When("I search {string} restaurant")
    public void i_search_restaurant(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I search" + string + "restaurant");
    }

    @Then("{string} restaurant is displayed")
    public void restaurant_is_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions

        System.out.println(string + "restaurant is displayed");
    }

    @But("If no hotel with matching name with {string} listed on swiggy")
    public void if_no_hotel_with_matching_name_with_listed_on_swiggy(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("If no hotel with matching name with" + string + "listed on swiggy");
    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string + "should be displayed");
    }
}
