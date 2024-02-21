package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CkeckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\padme\\Downloads\\chromedriver-win64\\chromedriver-win64\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//select specific checkbox/single checkbox
		//WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		//checkbox.click();
		
		//finding total number of check boxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("The total number of checkboxes: "+checkboxes.size());
		
		//click on all checkbox
//		for (int i = 0; i < checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//		
//	}
//		//uncheck
//		for (int i = 0; i < checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//	}
		//total number of checkbox-checkbox to be selected=starting index
//		for (int i = 5; i < checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//			
//		
//	}
		//select first two days
//		for (int i = 0; i < 2; i++) {
//	checkboxes.get(i).click();
//			
//		
//	}
//		for (int i = 0; i < checkboxes.size(); i++) {
//			if(i<2) {
//		checkboxes.get(i).click();
//			}
			for (int i = 0; i < checkboxes.size(); i++) {
				if(i==0) {
			checkboxes.get(i).click();
				}else if(i==3){
					checkboxes.get(i).click();
				}
}
			Thread.sleep(2000);
			driver.close();
}
}

