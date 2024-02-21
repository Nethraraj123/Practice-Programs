package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);//retrive the url
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);
       //driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Thread.sleep(1000);
        driver.quit();
        
	}

}
