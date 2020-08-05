package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MFirstClass {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HarshaShrivastava\\SeleniumH\\JavaProject\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
	
	driver.get("https://aiforevery1.com/demo-site");
	driver.manage().window().maximize();
	driver.findElement(By.id("menu-item-39")).click();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.navigate().back();
	
	
	WebElement firstname = driver.findElement(By.name("vfb-5"));
	if (firstname.isDisplayed())
	{
		System.out.println("firstname is displayed");
		//driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("t");
		
		
	}else
	
	{System.out.println("first name is not displayed");
	
	}
	
	
	
	
	Thread.sleep(3000);
	
	driver.findElement(By.name("vfb-7")).sendKeys("Jain");
	Thread.sleep(3000);
	
	driver.findElement(By.id("vfb-8-1")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("Hyderabad");
	
	Thread.sleep(3000);
	driver.findElement(By.id("vfb-13-address-2")).sendKeys("Moosapet");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#vfb-13-city")).sendKeys("S V SaiSrinivasam");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("500018");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("test");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#vfb-14")).sendKeys("wallerocandidate1@gmail.com");
	
	Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("9568741235");
	
	driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("This is my query");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("#vfb-3")).sendKeys("22");
	
	driver.findElement(By.name("vfb-submit")).click();
	
	
		
		
	}
	
	//driver.findElement(By.name("vfb-submit")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

	

