package SSS_CQA.SSS_CQA;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Stopwatch;

public class Waits_Tests {
	@Test
	public void implicit_Waits() {
		  System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();	        
	        driver.get("https://sellglobal.ebay.in/seller-center/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.manage().window().maximize();
	        Stopwatch watch = null;
	        try {
	        	watch = Stopwatch.createStarted();
	        	driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-e744f3a elementor-widget elementor-widget-html']//a[@class='link'][normalize-space()='START SELLING']")).click();
	        	
	        }
	        catch(Exception e) {
	        	watch.stop();
	        	System.out.println(e);
	        	System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
	        }
	        
	        
	}
	@Test
	public void excplict_Wats() {
		 System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();	        
	        driver.get("https://sellglobal.ebay.in/seller-center/");
	        driver.manage().window().maximize();
	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	        
	        		
	        Stopwatch watch = null;
	        try {
	        	watch = Stopwatch.createStarted();
	        	WebElement element =	wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//div[@class='elementor-element elementor-element-e744f3a elementor-widget elementor-widget-html']//a[@class='link'][normalize-space()='START SELLING']\"))")));
	        	element.click();
//	        	driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-e744f3a elementor-widget elementor-widget-html']//a[@class='link'][normalize-space()='START SELLING']")).click();
	        	
	        }
	        catch(Exception e) {
	        	watch.stop();
	        	System.out.println(e);
	        	System.out.println(watch.elapsed(TimeUnit.SECONDS) + "seconds");
	        }
	}

}
