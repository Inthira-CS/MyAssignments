package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        // Step 7: Enter the first name
        driver.findElement(By.name("firstname")).sendKeys("John");

        // Step 8: Enter the last name
        driver.findElement(By.name("lastname")).sendKeys("Doe");

        // Step 9: Enter the mobile number
        driver.findElement(By.name("reg_email__")).sendKeys("1234567890");

        // Step 10: Enter the password
        driver.findElement(By.name("reg_passwd__")).sendKeys("password123");
    }
}
