package Guru99Task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();

		List<WebElement> list = driver.findElements(By.xpath("(//ul[@id='java_technologies'])[9]"));
		
		for (int i= 0;i<list.size();i++) {
			WebElement w = list.get(i);
			String webList = w.getText();
			System.out.println(webList);
    	}
	    driver.close();
	}
}