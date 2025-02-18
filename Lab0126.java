package Relocated;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// review or absolute and relative xpath*[@attribute = 'vav']
// tranaplanted from G60 but did not take Mavern builder
@SuppressWarnings("unused")
//Nov 3, 2024 was IOException. is this because of not Maven?
public class Lab0126 {
	public static void main(String[] args) throws ClassNotFoundException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = (WebDriver) new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		//driver.options().
		//options.addArguments("--user-data-dir=C:\\Users\\AppData\\Local\\Microsoft\\Edge\\User Data");
		driver.get("https://tek-retail-ui.azurewebsites.net/selenium");
		//following siblings //tag/following-sibling::tagName
		//Parent  //tagName[@attribute='value']//parent::tagName
		//following = //tagName[@attribute='value']//parent::tagName
		//proceeding =//tagName[@attribute='value']//precediing:tagName
		//Child
		WebElement dyamic = driver.findElement(By.tagName("Dynamic Content"));
		dyamic.click();
		WebElement sibling = driver.findElement(By.xpath("//*[@class='py-1 px-2']"));
		System.out.println(sibling.getClass());
	}
}
