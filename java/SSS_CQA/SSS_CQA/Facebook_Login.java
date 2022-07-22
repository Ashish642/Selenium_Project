package SSS_CQA.SSS_CQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Login {
	 @Test
	    public void login() throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(4000);
	        driver.get("https://www.facebook.com/");
	        Thread.sleep(2000);
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.findElement(By.name("email")).sendKeys("Asshish");
	        Thread.sleep(2000);

	        driver.findElement(By.id("pass")).sendKeys("123");
	        Thread.sleep(2000);
	        driver.findElement(By.name("login")).click();
	        Thread.sleep(2000);
//	        driver.findElement(By.name("Create New Account")).click();
//	        Thread.sleep(2000);
//	        driver.close();
	   
	 }
	
}




