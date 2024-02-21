package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement emaliTxtfield=driver.findElement(By.id("email"));
		Actions right_click= new Actions(driver);
		right_click.contextClick(emaliTxtfield).build().perform();
		

	}

}
