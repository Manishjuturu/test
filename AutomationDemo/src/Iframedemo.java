import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframedemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		List<WebElement>iframescount=driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames:"+iframescount.size());
int size= driver.findElements(By.tagName("iframe")).size();
driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
driver.switchTo().frame("singleframe");
driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input")).sendKeys("Selenium");
Thread.sleep(3000);
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
driver.findElement(By.xpath("//div[@class='row']"));
driver.switchTo().frame(1);
driver.switchTo().frame(0);
WebElement textbox2=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
textbox2.sendKeys("Success");
Thread.sleep(3000);
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();

	}

}
