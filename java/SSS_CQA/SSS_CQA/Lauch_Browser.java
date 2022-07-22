package SSS_CQA.SSS_CQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lauch_Browser {
	
	 @Test
	    public void launch() throws InterruptedException {

	        System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(4000);
	        driver.get("https://www.facebook.com/");
	        Thread.sleep(2000);
	        driver.manage().window().maximize();
//	        System.out.println(driver.getTitle());
	        Thread.sleep(2000);
	        String title = driver.getTitle();
	        System.out.println("the title of page is :" +title);
	        Thread.sleep(2000);
	        String currentURL = driver.getCurrentUrl();
	        System.out.println("the URL of page is:" +currentURL);
	        Thread.sleep(2000);
	        String pageSourceCode = driver.getPageSource();
	        System.out.println("the source code of page is :" +pageSourceCode);
//	        Navigate Browser
	        driver.navigate().to("https://www.flipkart.com/");
	        Thread.sleep(2000);
	        String fktitle = driver.getTitle();
	        System.out.println("the title of page is :"+fktitle);
	        Thread.sleep(2000);
	        driver.navigate().back();
	        Thread.sleep(2000);
	        driver.navigate().forward();
	        Thread.sleep(2000);
	        driver.navigate().refresh();
	        Thread.sleep(2000);
	        driver.close();

	    }
	}



