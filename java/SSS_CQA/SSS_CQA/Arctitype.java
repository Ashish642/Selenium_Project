package SSS_CQA.SSS_CQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Arctitype {
	 @Test
	    public void type() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(4000);
	        driver.get("file:///C:/Users/DELL/Desktop/Arctitype.html");
	        Thread.sleep(2000);
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.findElement(By.id("username")).clear();
	        Thread.sleep(2000);
	        driver.findElement(By.id("username")).sendKeys("Ashish");
	        Thread.sleep(2000);
	        driver.findElement(By.id("pass")).clear();
	        Thread.sleep(2000);
	        driver.findElement(By.id("pass")).sendKeys("subham");
//	        driver.close();

	    
	 }
	
}



