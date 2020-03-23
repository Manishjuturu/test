import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("manish");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Juturu");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("H.No: 8-98/A, Reddy's street, Electronic city, Bangaluru,Karnataka");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("manishjuturu21@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("6304944829");
		driver.findElement(By.xpath("//label[1]//input[1]")).click();
		//dynamic female
		//driver.findElement(By.xpath("//input[@name='radiooptions' and @ value='FeMale']")).click();
	//Hobbies
		List<WebElement>cb= driver.findElements(By.xpath("//*[@type='checkbox']"));
		
		for(int i=0; i<cb.size();i++)
		{
			cb.get(i).click();
		}
//		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
//		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
//		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
	//languages
		
		driver.findElement(By.id("msdd")).click();
		
		{
			driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Dutch')]")).click();
		}

	
		//Skills
	Select dropdown= new Select(driver.findElement(By.id("Skills")));
	dropdown.selectByVisibleText("Adobe Photoshop");
	//country
		Select dropdown1= new Select(driver.findElement(By.id("countries")));
	dropdown1.selectByVisibleText("India");
	
	//select country
	//Select dropdown2= new Select(driver.findElement(By.xpath("//span[@class='dropdown-wrapper']")));
//dropdown2.selectByIndex("1");

	//DOB //YEAR
//driver.findElement(By.xpath("//option[contains(text(),'1998')]")).click();
WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
Select sel2=new Select(year);
sel2.selectByValue("1916");
      
      List<WebElement>yearcount=sel2.getOptions();
       System.out.println(yearcount.size());
        for(int i=0;i<yearcount.size();i++)
{
	System.out.println(yearcount.get(i).getText());
}

//Month
//driver.findElement(By.xpath("//option[contains(text(),'July')]")).click();
WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
Select sel3=new Select(month);
sel3.selectByIndex(2);
   
    List<WebElement>monthcount=sel3.getOptions();
     System.out.println(monthcount.size());
      for(int i=0;i<monthcount.size();i++)
{
	System.out.println(monthcount.get(i).getText());
}
//day
//driver.findElement(By.xpath("//select[@id='daybox']//option[contains(text(),'13')]")).click();
WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
Select sel4=new Select(day);
sel4.selectByVisibleText("1");


    List<WebElement>datecount=sel4.getOptions();
     System.out.println(datecount.size());
      for(int i=0;i<datecount.size();i++)
{
	System.out.println(datecount.get(i).getText());
}
//password
driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Manish13");
//confirm password
driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Manish13");
//submit
//driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	driver.close();
	}}
