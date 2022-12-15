package testobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.Cartpage;
import pageobjects.Checkoutpage;
import pageobjects.Confirmationpage;
import pageobjects.Loginpage;

import pageobjects.Productcataloguepage;

public class Test1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vuppula.samyuktha\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
        Loginpage loginpage =new Loginpage(driver);
        loginpage.goTo();
        loginpage.LoginApplication();
        Productcataloguepage catalogue=new Productcataloguepage(driver);
        catalogue.addItems();
        Cartpage cart=new Cartpage(driver);
        cart.cartApplication();
        Checkoutpage check = new Checkoutpage(driver);
        check.checkOutApplication();
        Confirmationpage confirm = new Confirmationpage(driver);
        confirm.confirmationApplication();
        driver.close();
	}
}
        
        