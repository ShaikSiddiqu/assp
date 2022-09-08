package stepdef;
import io.cucumber.java.en.*;

public class ProductStoreHomePageSteps {
	@Given("product store page1")
	public void product_store_page1() {
		System.out.println("Inside Step-product store page1");
	    
	}

	@And("user clicks on the home after login")
	public void user_clicks_on_the_home_after_login() {
		System.out.println("Inside Step-user clicks on the home after login");
	   
	}

	@When("hitts on home")
	public void hitts_on_home() {
		System.out.println("Inside Step-hitts on home");
	    
	}

	@Then("user is navigated to home page1")
	public void user_is_navigated_to_home_page1() {
		System.out.println("Inside Step-user is navigated to home page1");
	    
	}

	


	
}
