package Guru99Task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CourseList {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.guru99.com/");
	driver.manage().window().maximize();

	List<WebElement> list = driver.findElements(By.xpath("//div[@class='moduletable ']//following::b"));
	
	for (int i= 0;i<list.size();i++) {
		WebElement wb = list.get(i);
		String text = wb.getText();
		System.out.println(text);
	   }
	driver.close();
	}
}
