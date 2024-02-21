package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.id("email")).sendKeys("Netharr@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nethara");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		

	}

}
