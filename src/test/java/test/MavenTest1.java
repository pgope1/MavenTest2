package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenTest1 {
	
	@Test
	public void Login(){
		
		System.out.println("Logging into the account");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Logging into the account");
	
	}

}
