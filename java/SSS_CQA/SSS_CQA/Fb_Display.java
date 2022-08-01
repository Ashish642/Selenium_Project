package SSS_CQA.SSS_CQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fb_Display {
	@Test
	public void excpetedPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
//        System.out.println(driver.getTitle());
        Thread.sleep(2000);
		String excepectedTitle = "facebook";
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(excepectedTitle)) {
			System.out.println("expected page is displayed");
		}
		else {
			System.out.println("excpted is not displayed");
		}
		driver.close();
	}
	@Test
	
	public void excpectedUrl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
 
         String expectedUrl = "facebook";
 
         String actualUrl = driver.getCurrentUrl();
 
         if (actualUrl.contains(expectedUrl)) {
 
         System.out.println("expected url is displayed");
         }      
         else{
             System.out.println("ecpected is NOT displayed");
       }
         driver.close();
		
	}
	
	

}
