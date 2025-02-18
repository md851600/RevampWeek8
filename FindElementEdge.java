package Relocated;
//from Week18Home
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementEdge {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
// debugger add cast to EdgeDriver 10/11/2024
		WebDriverManager.edgedriver().setup();
		WebDriver driver = (WebDriver) new EdgeDriver();
		//driver.manage().window().maximize(); Jan 25 add screen shots
		 // Jan23, this runs from main directory, comment out in porm.xml
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.hotmail.com");

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("./output/image.png"));
		WebElement push = driver.findElement(By.xpath("select[@ id='internal sign-in-link']"));
		push.click();	
	}

}
