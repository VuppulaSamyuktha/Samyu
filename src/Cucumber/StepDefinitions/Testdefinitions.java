package Cucumber.StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Cartpage;
import pageobjects.Checkoutpage;
import pageobjects.Confirmationpage;
import pageobjects.Loginpage;

import pageobjects.Productcataloguepage;

public class Testdefinitions {
	WebDriver driver;

	@Given("I landed on Ecommerce page")
	public void I_landed_on_ecommerce_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vuppula.samyuktha\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Loginpage loginpage = new Loginpage(driver);
		loginpage.goTo();

	}

	@Given("login with username and password")
	public void login_with_username_and_password() throws IOException {
		Loginpage loginpage = new Loginpage(driver);
		loginpage.LoginApplication();
	}

	@And("products added to the cart page")
	public void products_added_to_the_cart_page() throws IOException {
		Productcataloguepage catalogue = new Productcataloguepage(driver);
		catalogue.addItems();
	}

	@When("checking out the cart products")
	public void checking_out_the_cart_products() throws InterruptedException {
		Cartpage cart = new Cartpage(driver);
		cart.cartApplication();
	}

	@And("filling the details and place the order")
	public void filling_the_details_and_place_the_order() throws InterruptedException, IOException {
		Checkoutpage check = new Checkoutpage(driver);
		check.checkOutApplication();

	}

	@Then("message is displayed")
	public void message_is_displayed() throws InterruptedException {
		Confirmationpage confirm = new Confirmationpage(driver);
		confirm.confirmationApplication();
	}

}
