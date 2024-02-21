package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys("Nethra");
		driver.findElement(By.name("lastName")).sendKeys("R");
		driver.findElement(By.name("phone")).sendKeys("789065432");
		driver.findElement(By.name("userName")).sendKeys("Nethrar234@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("Murugamale");
		driver.findElement(By.name("city")).sendKeys("Chintamani");
		driver.findElement(By.name("state")).sendKeys("Karnataka");
		driver.findElement(By.name("postalCode")).sendKeys("345678");
		WebElement drp=driver.findElement(By.name("country"));
		Select dropdown=new Select(drp);
		dropdown.selectByVisibleText("ALGERIA");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Nethraraj");
		driver.findElement(By.name("password")).sendKeys("Pulwama@48");
		driver.findElement(By.name("confirmPassword")).sendKeys("Pulwama@48");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
