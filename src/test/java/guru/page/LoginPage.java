package guru.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    final String XPATH_PROFILE_USER_NAME ="//a[contains(@class,'account')]/span";
    final String XPATH_SCROLL_TAB = "//li/a[contains(text(), '"  + "NAME"+ "')]";
    final String XPATH_TAB = "//li/a[contains(text(), '"  + "NAME"+ "')]";
	
	public void enterUserName(String name) {
		WebElement email = driver.findElement(By.id("email"));
    	email.sendKeys(name);   
	}
	
	public void clickTab(String tabName) {
		driver.findElement(By.xpath(XPATH_TAB.replace("NAME", tabName))).click();  
	}
	
	
	public String getUserNameFromprofile() {
		WebElement username = driver.findElement(By.xpath(XPATH_PROFILE_USER_NAME));
		
		return username.getText();
	}
	
	
	
	public void enterPassword(String pass) {
		 driver.findElement(By.id("passwd")).sendKeys(pass);
	}
	
	public void selectLoginURL() {
		 driver.findElement(By.cssSelector("a[href='../../test/login.html']")).click();
	}
	
	
	public void clickLogin() {
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	public void navigateToLogin() throws Throwable {
	     //  WebElement signIn =  driver.findElement(By.linkText("Sign in"));
	    	 WebElement signIn =  driver.findElement(By.className("login"));	
	       signIn.click();
	    }
	
	public void clickScrollTab(String scrollTab) {
		driver.findElement(By.xpath(XPATH_SCROLL_TAB.replace("NAME",scrollTab ))).click();  
	}
	
}
