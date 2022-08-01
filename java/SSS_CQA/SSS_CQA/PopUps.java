package SSS_CQA.SSS_CQA;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PopUps {
	@Test
	public void simpleAlertPopups() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(200);	
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(200);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	@Test
	public void conformationPopUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        driver.manage().window().maximize();
        Thread.sleep(200);	
        driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
        Alert conalert = driver.switchTo().alert();
        String alertText = conalert.getText();
        System.out.println("the test is :"+alertText);
        conalert.accept();
		
	}
	@Test
	public void promptPopUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(200);	
        driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
        Alert promtAlert = driver.switchTo().alert();
         promtAlert.sendKeys("Ashish");
         Thread.sleep(200);
         promtAlert.accept();
		
		
	}
	@Test
	public void hiddenpopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("");
        driver.manage().window().maximize();
        Thread.sleep(200);
		
		
	}
	@Test
	public void fileUpload() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\DELL\\Documents\\ASHISH.pdf");
	}
	@Test
	public void autoIt_FileUpload() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        Thread.sleep(200);
        WebElement button= driver.findElement(By.xpath("//input[@id='file-upload']"));
    	Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		Thread.sleep(2000);
        

//   
        Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\WebTechnology\\jjjl.exe" + " " + "C:\\Users\\DELL\\Documents\\aassshi.pdf");
////        driver.findElement(By.xpath("//span[@class='sc-1rd62mt-2 ejRuwW']")).click();
//        Thread.sleep(2000);
//        driver.close();
	}

}
