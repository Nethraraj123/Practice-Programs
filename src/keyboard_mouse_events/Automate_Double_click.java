package keyboard_mouse_events;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automate_Double_click {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		//specify the location of chromedriver.exe file
		WebDriver driver=new ChromeDriver();//create object of chromedriver class
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");//redirect to the given url
		driver.manage().window().maximize();//To maximise the window
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		WebElement button=driver.findElement(By.xpath("//button[text()='Double-click me']"));//custumised xpath
		
		
		//It contains commands keyboard and mouse to perform action
		//to perform double click
		Actions new_Action= new Actions(driver);
		
		//creating abject of action class access it to perfoem action
		new_Action.doubleClick(button).build().perform();
		
		//to perform action we use build and perform commands compulsory

	}

}
