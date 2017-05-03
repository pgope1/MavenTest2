package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MavenTest1 {
	
	@Test
	public void Login(){
		
		
 		WebDriver driver = new FirefoxDriver();
 		driver.get(“https://www.societyleadership.org“);
        	driver.findElement(By.xpath(“.//*[@id=‘edit-submit--2’]“)).click();
		//System.out.println("Logging into the account");
	System.out.println("Logging into the account");
	}

}
