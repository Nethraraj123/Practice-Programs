package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		Thread.sleep(10000);
		
		List<WebElement> suggetions=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']"));
		System.out.println(suggetions.size());
		
		Thread.sleep(2000);
		for (int i = 0; i < suggetions.size(); i++) {
			String suggetionText=suggetions.get(i).getText();
			
			System.out.println(suggetionText);
			
			if (suggetionText.contains("selenium webdriver")) {
				
				suggetions.get(i).click();
				break;
				
				
			}
		}
	}

}
