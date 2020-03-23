import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class log4jDemo {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(log4jDemo.class);
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		log.info("URL LAUNCHED");
		
		String title= driver.getTitle();
		System.out.println(title);
		log.warn("check title");
		
		if(title.equals("google"))
		{
			System.out.println("Matched");
		log.info("The Url is correct");
		}
	
		else
		{
			System.out.println("Not Matched");
			log.error("The URL is not correct");
		}
	}

}
