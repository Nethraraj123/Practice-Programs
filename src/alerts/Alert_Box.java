package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Box {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		//specify the location of chromedriver.exe file
		WebDriver driver=new ChromeDriver();//create object of chromedriver class
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");//redirect to the given url
		driver.manage().window().maximize();//To maximise the window
		
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Thread.sleep(3000);
		//switch focus to normai window to alert
		//Alert is an interface of selenium
	    Alert al=driver.switchTo().alert();
	    String alert_text=al.getText();
	    
	    System.out.println("The alert text is: "+alert_text);
	    //to click on ok button
	    al.accept();
	    //al.dismiss(); to click on cancel button
	    Thread.sleep(2000);
	    driver.close();
	
		
		
	}

}
