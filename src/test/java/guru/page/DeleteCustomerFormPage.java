package guru.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DeleteCustomerFormPage extends BasePage{

    final String XPATH_PROFILE_USER_NAME ="//a[contains(@class,'account')]/span";
    
	
	public void enterUserName(String name) {
		WebElement email = driver.findElement(By.id("email"));
    	email.sendKeys(name);   
	}
	
	
	
	
}
