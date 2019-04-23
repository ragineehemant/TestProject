package guru.step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import guru.page.LoginPage;

public class LoginStep {
	WebDriver driver;
                                      
    LoginPage login = new LoginPage();
    
	@Given("^user navigates to url \"(.*)\"$")
    public void user_is_on_homepage(String name) throws Throwable { 
		
		login.navigateToURL(name);
    }
	
	@And("^user selects the tab \"(.*)\"$")
    public void clickTab(String tab) throws Throwable{	
	
	login.clickTab(tab);
	}
    
    @When("^user clicks on Login$")
    public void user_clicks_on_Login() throws Throwable {
   // WebElement login = driver.findElement(By.cssSelector("a[href='../../test/login.html']"));
    login.selectLoginURL();
    }
    
    @When("^user enters user name \"(.*)\" and Password \"(.*)\"$")
    public void user_enters_username_and_Password(String username , String pass) throws Throwable {
    	login.enterUserName(username);
    	login.enterPassword(pass);
    	login.clickLogin();
    }
    
    @When("^user sees username as \"(.*)\"$")
    public void validateUser(String expectedName) throws Throwable {
    
    	String onScreenUserName = login.getUserNameFromprofile();
    	
    	Assert.assertEquals(expectedName, onScreenUserName);
    	
    }
    
	
    
   }
      





	