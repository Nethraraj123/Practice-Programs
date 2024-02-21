package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("userName")).sendKeys("Nethrarajr");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Pulwama@48");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		driver.quit();
		

	}

}
