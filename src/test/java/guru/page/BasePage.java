package guru.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {	
	
	 WebDriver driver;
	 static String GURU_URL = "http://www.demo.guru99.com/V4/";
	
	public void navigateToURL(String url) {
		System.setProperty("webdriver.chrome.driver","C://software//chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        if(url.equals("GURU_LOGIN")) {
        	driver.get(GURU_URL);
        }
        
	}
}
