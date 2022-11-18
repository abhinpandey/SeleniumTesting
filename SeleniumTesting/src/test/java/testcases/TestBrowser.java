package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {
	public static WebDriver driver;
	public static String browser = "chrome";

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		if (browser.equals("chrome"))

		{
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox"))

		{

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equals("edge"))

		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("http://gmail.com");
		String title = driver.getTitle();
		int len = title.length();
		System.out.println("title is :" + title);
		System.out.println("Length of title is :" + len);

		String expectedTitle = "google.com";
		if (title.equals(expectedTitle)) {
			System.out.println("Test case pass");
		}

		else {
			System.out.println("test case fail");
		}
		WebElement username=driver.findElement(By.id("identifierId"));
		username.sendKeys("abhinpandey@gmail.com");
//		driver.close();
	}

}
