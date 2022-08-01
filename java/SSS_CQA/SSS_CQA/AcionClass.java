package SSS_CQA.SSS_CQA;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AcionClass {
	@Test
	public void contextClickusingActionsClass() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.get("https://www.spicejet.com");

        Thread.sleep(2000);
        driver.manage().window().maximize();
      //find the ActiTIME Inc. link
        WebElement link = driver.findElement(By.linkText("Hotels"));
      //right click (context click) on actitime link
        Actions actions = new Actions(driver);
        actions.contextClick(link).perform();
        Thread.sleep(3000);
      //press 'w' from the keyboard for opening in a new window
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W);
        //quit() method closes all the browsers opened by Selenium
//        driver.quit();

	}
	@Test
	public void gmail_contextClickDemo_mailArchive() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(4000);
        driver.get("https://www.gmail.com");
      //enter email id
      driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ashish.05041@gmail.com");
      //click on Next button
      driver.findElement(By.xpath("//span[.='Next']")).click();
      Thread.sleep(3000);
      //enter password id
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pintu&544");
    //click on Next button
      driver.findElement(By.xpath("//span[.='Next']")).click();
      Thread.sleep(10000);
      //Write xpath expression for the mail item based on a subject
      String xp = "(//b[contains(.,'Following Openings (for Bangalore)')])[2]";
      //get the address of the mail item which you want to archive
      WebElement mail = driver.findElement(By.xpath(xp));
      //print the subject of the mail
      System.out.println(mail.getText());
    //Creating an object of Actions class 
      Actions actions = new Actions(driver);
      //using Actions class object and contextClick() method, right click on the mail item
      actions.contextClick(mail).perform();
      Thread.sleep(6000);
      //click on Archive to archive the mail 
      driver.findElement(By.xpath("(//div[@class='J-N-JX aDE aDD'])[1]")).click();
	}
	@Test
	public void moveElement() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(200);
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(200);
	        WebElement element = driver.findElement(By.id("pass"));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).click().perform();
	        Thread.sleep(2000);
	        WebElement element1 = driver.findElement(By.id("email"));
	        element1.click();
	}
	@Test
	public void dropdownMenu() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(200);
	        driver.get("https://www.istqb.in/");
	        driver.manage().window().maximize();
	        Thread.sleep(200);
	        WebElement home = driver.findElement(By.xpath("//ul[@class='uk-navbar-nav uk-hidden-small']//a[normalize-space()='Home']"));
	        Actions actions = new Actions(driver);
	        //mouse hover on Home tab
        actions.moveToElement(home).perform();
//	        Thread.sleep(3000);
//	        WebElement aboutus = driver.findElement(By.xpath("//li[@class='uk-parent uk-open']//a[@href='#'][normalize-space()='ABOUT US']"));
//	        //mouse hover on Enrollment 
//	        actions.moveToElement(aboutus).perform();
//	        Thread.sleep(3000);
//	        WebElement foundation = driver.findElement(By.xpath("//li[@class='uk-parent uk-open']//a[@href='#'][normalize-space()='Foundation']")); 
//	        		
//
//	        //mouse hover on Corporate Enrollment
//	        actions.moveToElement(foundation).perform();
//	        Thread.sleep(3000);
//	        //click on Corporate Enrollment
//	        driver.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']")).click();
	        driver.close();

	        
		
	}
	@Test
	public void dragDrop() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(200);
	        driver.get("https://jqueryui.com/droppable/");
	        driver.manage().window().maximize();
	        Thread.sleep(200);
	        driver.switchTo().frame(0);
	        WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));
	        WebElement element1 = driver.findElement(By.xpath("//div[@id='droppable']"));
	        Actions actions = new Actions(driver);
	        actions.clickAndHold(element).moveToElement(element1)
	        .release()
	        .build()
	        .perform();
	        driver.close();
	        
	}
	@Test
	public void mouseDoubleClicAction() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        Thread.sleep(200);
	        driver.get("http://omayo.blogspot.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(200);
	        WebElement doubleClicklink = driver.findElement(By.xpath("//p[@id='testdoubleclick']"));
	        Actions actions = new Actions(driver);
	        actions.doubleClick(doubleClicklink).build().perform();
	        Thread.sleep(2000);
	        driver.close();
	
	}
	@Test
	public void rightClick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        Thread.sleep(200);
        WebElement button = driver.findElement(By.xpath("//section[@class='wy-nav-content-wrap']//ul[1]//li[1]"));
		Actions actions = new Actions(driver);
		actions.contextClick(button).build().perform();
		Thread.sleep(2000);
	}
	@Test
	public void mouseHover() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        Thread.sleep(200);	
        WebElement desktopmenu = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(desktopmenu).moveToElement(mac).click().perform();
    
		
	}
	@Test
	public void key_method() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(200);
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(200);	
        WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).perform();
        Thread.sleep(200);
        actions.sendKeys("qs").perform();
        Thread.sleep(200);
        actions.keyUp(Keys.SHIFT).perform();
        Thread.sleep(200);
        actions.doubleClick(search).perform();
        Thread.sleep(200);
        actions.keyDown(Keys.CONTROL).sendKeys("x").perform();
        Thread.sleep(200);
        actions.keyUp(Keys.CONTROL).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("v").perform();
        Thread.sleep(200);
        actions.keyUp(Keys.CONTROL).perform();
        Thread.sleep(4000);
        driver.close();
		
	}

	
	


}
