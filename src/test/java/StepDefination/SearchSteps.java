package StepDefination;

import implementations.Product;
import implementations.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class SearchSteps {
    Product product;
    Search search;
    @Given("I have a search field on amazon page")
    public void i_have_a_search_field_on_amazon_page() {
        System.out.println("Step 1: inside given");
    }

    @When("I search a product with name {string} and price {int}")
    public void i_search_a_product_with_name_and_price(String string, Integer int1) {
        System.out.println("Step 2: Product "+ string +"  at price "+ int1);
        product = new Product(string, int1);
    }

    @Then("Prodect with name {string} should be  displayed")
    public void prodect_with_name_should_be_displayed(String string) {
        System.out.println("Step 3: "+ string +" This prodct should display");
        search = new Search();
        String actual= search.displayProductName(product);
        Assert.assertEquals(actual, string);
    }
}
