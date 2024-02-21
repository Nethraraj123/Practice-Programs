package package1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Country_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement drp=driver.findElement(By.xpath("//select[@id='country']"));
		Select dropdown=new Select(drp);
		dropdown.selectByVisibleText("India");
		
		
		List<WebElement> options= dropdown.getOptions();
		System.out.println("the total number of countries: "+options.size());
		for (int i = 0; i <options.size(); i++) {
			String country=options.get(i).getText();
		System.out.println(country);
			
		}
		Thread.sleep(2000);
		driver.close();

	}

}
