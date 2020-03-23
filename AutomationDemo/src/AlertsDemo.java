import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert1=driver.switchTo().alert();
		
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(3000);
    alert1.accept();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    
    Alert alert2=driver.switchTo().alert();
    String alertmessage1=driver.switchTo().alert().getText();
    System.out.println(alertmessage1);
    Thread.sleep(3000);
    alert2.dismiss();
   
    
    driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
    
    Alert alert3=driver.switchTo().alert();
    String alertmessage2=driver.switchTo().alert().getText();
    		System.out.println(alertmessage2);
    Thread.sleep(3000);
    alert3.sendKeys("Manish is a badboy");
    alert3.accept();
	}
    		
    
    
    
    
    
    
    
    
    
    
    
    
     //driver.close();
	}

