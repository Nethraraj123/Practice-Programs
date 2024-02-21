package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement drp=driver.findElement(By.xpath("//select[@id='country-list']"));
        Select dropdown=new Select(drp);
       // dropdown.selectByVisibleText("India");
        //dropdown.selectByValue("4"); //this option is use only if you have value attribute
        dropdown.selectByIndex(3);
        
        WebElement drp1=driver.findElement(By.xpath("//select[@id='state-list']"));
        Thread.sleep(3000);
        Select dropdown1=new Select(drp1);
        dropdown1.selectByIndex(2);
       
	}

}
