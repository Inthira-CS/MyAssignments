package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
		// to launch Chrome browser
		// Object creation of Chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// to maximize the window
		
		driver.manage().window().maximize();
		
		// to load the URL
		
		driver.get("https://www.dominos.com");
		driver.findElement(By.id("loginNumber")).sendKeys("8667073079");
		// to get the title of the page
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	if(pageTitle.equals("Dominos"))

	{
		System.out.println("Verified");
	}else
	{
		System.out.println("Not verified");
	}
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL");
	if(currentUrl.contains("dominos.com"))
	{
		System.out.println("URL is verified");
	}
  }
}
