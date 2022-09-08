package stepdef;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class googleSearches {

	public googleSearches() {
		// TODO Auto-generated constructor stu
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'demoblaze")).sendKeys("demoblaze");
		
		
		
		

	}

}
