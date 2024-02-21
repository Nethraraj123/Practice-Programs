package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nethra");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Nethrar@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9807654321");
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.close();
	}

}
