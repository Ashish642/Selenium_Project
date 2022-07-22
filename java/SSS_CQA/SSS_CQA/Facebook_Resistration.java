package SSS_CQA.SSS_CQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook_Resistration {
	@Test
	public void signup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Ashish");
        Thread.sleep(2000);


        driver.findElement(By.name("lastname")).sendKeys("Vishwakarma");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("ashishkumarvish.432@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ashishkumarvish.432@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("wwwwrr");
        Thread.sleep(2000);
        WebElement dateElement= driver.findElement(By.name("birthday_day"));
        Thread.sleep(2000);
        WebElement monthElement = driver.findElement(By.name("birthday_month"));
        Thread.sleep(2000);
        WebElement yearElement = driver.findElement(By.name("birthday_year"));
        Thread.sleep(2000);

        Select d_Dropdown = new Select(dateElement);
        Select m_Dropdown = new Select(monthElement);
        Select y_Dropdown = new Select(yearElement);

        d_Dropdown.selectByVisibleText("8");
        m_Dropdown.selectByVisibleText("Feb");
        y_Dropdown.selectByVisibleText("1997");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
    }

}



