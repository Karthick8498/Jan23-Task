package LifeTimeTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class membershipList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lifetime.life/");
		driver.findElement(By.xpath("//a[@aria-label='Membership ']")).click();
		
		List<WebElement> saftyMeasureList = driver.findElements(By.xpath("//ul[@class='list-unstyled ']"));
		
		for (WebElement list : saftyMeasureList) {
			String text = list.getText();
			System.out.println(text);
		}
		driver.close();
	}
}
