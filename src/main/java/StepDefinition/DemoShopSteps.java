package StepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class DemoShopSteps {
WebDriver driver;

	@Given("^Navigate to Testshop$")
	public void navigate_to_Testshop() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://testscriptdemo.com/");
		
	}
	
	@Then("^I add four different products to my wish list$")
	public void i_add_four_different_products_to_my_wish_list() throws InterruptedException {
	
		WebElement element = driver.findElement(By.xpath("//a[@data-product-id ='22']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//a[@data-product-id ='22']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@data-product-id ='18']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@data-product-id ='19']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@data-product-id ='20']")).click();
		Thread.sleep(500);
	}
	@When("^I view my wishlist table$")
	public void i_view_my_wishlist_table() {
		WebElement element = driver.findElement(By.xpath("//i[@class='lar la-heart'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//i[@class='lar la-heart'])[1]")).click();
	   
	}
	
	
	@Then("^I find total four selected items in my wishlist$")
	public void i_find_total_four_selected_items_in_my_wishlist() {
	   
		List<WebElement> products = driver.findElements(By.xpath("//td[@class='product-name']"));
		int size = products.size();
		Assert.assertEquals(size,4);
		
	}
	
	@Then("^I am able to add the lowest price item to my cart$")
	public void i_am_able_to_add_the_lowest_price_item_to_my_cart() {
	List<WebElement> priceList = new ArrayList<>();
  
    	priceList = driver.findElements(By.xpath("//td[@class='product-price']//following::bdi)"));
    	int min=0;
    	for(int k=0; k<7; k++) {
    		int price= Integer.parseInt(priceList.get(k).getText());
    		if (price<=min)
    			min= price;
    	  			
    	}
    	   
	}
 
    @Then("^I am able to verify the item in my cart$")
    public void i_am_able_to_verify_the_item_in_my_cart() {
    	driver.findElement(By.xpath(""))
    
        
    }
    	
    	
    }
	
	
	
}
