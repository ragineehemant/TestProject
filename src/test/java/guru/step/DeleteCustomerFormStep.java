package guru.step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import guru.page.LoginPage;

public class DeleteCustomerFormStep {
	WebDriver driver;
                                      
    LoginPage login = new LoginPage();
    
    
    
	    
    @Then("^user selects the scrollTab \"(.*)\"$")
    public void selects_the_scrollTab(String scrollTab) throws Throwable{	
    	
    	login.clickScrollTab(scrollTab);
    }
    
	    
	
    
   }
      





	