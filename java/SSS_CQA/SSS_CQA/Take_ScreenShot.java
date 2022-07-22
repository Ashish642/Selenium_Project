package SSS_CQA.SSS_CQA;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Take_ScreenShot {
	 @Test
	    public void screenshot() throws IOException, InterruptedException{
	        System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(200);
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(200);
	        driver.findElement(By.id("email")).sendKeys("Ashish");
	        Thread.sleep(200);
	        TakesScreenshot ts = (TakesScreenshot)driver;
	        File srcFile = ts.getScreenshotAs(OutputType.FILE);
	        File destFile = new File("./Screenshot/"+"facebook"+".png");
	        FileHandler.copy(srcFile,destFile);
	        

	    }
	}


