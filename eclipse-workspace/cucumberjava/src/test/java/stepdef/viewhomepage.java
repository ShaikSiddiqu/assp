package stepdef;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class viewhomepage {

	public viewhomepage() {

	}

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver","/C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.youtube.com");
			
			//Navigation nav=driver.navigate();
			//nav.to("https://www.facebook.com");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		


	}

}
