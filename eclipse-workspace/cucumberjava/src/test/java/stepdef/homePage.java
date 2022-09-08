package stepdef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class homePage {
	String url="https://www.demoblaze.com/index.html";
	WebDriver driver=null;
	
	@Given("I have a browser opened and url is navigated")
	public void i_have_a_browser_opened_and_url_is_navigated() {
		System.out.println("Inside Step- I have a browser opened and url is navigated");
		driver=new ChromeDriver();
		driver.get(url);
		
	    
	}

	@When("home page1 is viewed")
	public void home_page1_is_viewed(String product) {
		System.out.println("Inside Step- home page1 is viewed");
		WebElement searchBox=driver.findElement(By.id("index.html"));
		searchBox.sendKeys(product);
		
	    
	}

	@And("product list should be appear pertaining to the home page1 product")
	public void product_list_should_be_appear_pertaining_to_the_home_page1_product() {
		System.out.println("Inside Step- product list should be appear pertaining to the home page1 product");
		WebElement searchBox1=driver.findElement(By.xpath("//input[@value='Go']"));
		searchBox1.click();
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("Inside Step- check more outcomes");
		WebElement productDescp=driver.findElement(By.xpath("//[@class='a-size-medium a-color-base a-text-normal']"));
		String desp=productDescp.getText();
	    
	}

	}
