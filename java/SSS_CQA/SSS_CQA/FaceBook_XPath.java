package SSS_CQA.SSS_CQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FaceBook_XPath {
	@Test
	public void login ()throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ashishkumarvish.432@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("wwwwrr");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("// a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id ='identify_email']")).sendKeys("ashishkumarvish.432@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@name='did_submit']")).click();
//		Thread.sleep(2000);
		
		
		
}
	
	@Test
	public void facebook_signup() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashish");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vishvakarma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ashishkumarvish.432@gmil.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ashishkumarvish.432@gmil.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("wwwwrr");
		Thread.sleep(2000);
		WebElement dateElement= driver.findElement(By.xpath("//*[@id='day']"));
		Thread.sleep(2000);
		WebElement monthElement = driver.findElement(By.xpath("//*[@id='month']"));
		Thread.sleep(2000);
		WebElement yearElement = driver.findElement(By.xpath("//*[@id='year']"));
		Thread.sleep(2000);
		
		
		Select dateDropdown = new Select(dateElement); 
		Select monthDropdown = new Select(monthElement);
		Select yearDropdown = new Select(yearElement);
		
		dateDropdown.selectByVisibleText("8");
		monthDropdown.selectByVisibleText("Feb");
		yearDropdown.selectByVisibleText("1997");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		//driver1.close();
	}
	

}


