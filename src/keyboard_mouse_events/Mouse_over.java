package keyboard_mouse_events;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		//specify the location of chromedriver.exe file
		WebDriver driver=new ChromeDriver();//create object of chromedriver class
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/b?ie=UTF8&node=29657746031");//redirect to the given url
		driver.manage().window().maximize();//To maximise the window
		
		Thread.sleep(2000);
		WebElement acc_list=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action=new Actions(driver);
		action.moveToElement(acc_list).build().perform();
		
		Thread.sleep(2000);
		
		WebElement orders=driver.findElement(By.xpath("//span[text()='Your Orders']"));
		action.click(orders).build().perform();
		Thread.sleep(2000);
		WebElement email_textBox=driver.findElement(By.id("ap_email"));
		action.sendKeys(email_textBox, "nethrar1111@gmail.com").build().perform();
		
//	WebElement continue_button =driver.findElement(By.id("continue"));
//		action.click(continue_button).build().perform();
		
		WebElement password_textBox=driver.findElement(By.id("ap_password"));
		action.sendKeys(password_textBox, "9380652971").build().perform();
		
		WebElement signIn_button=driver.findElement(By.id("signInSubmit"));
		action.click(signIn_button).build().perform();
		//driver.close();

	}

}
