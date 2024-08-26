package automationstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Eva2 {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationteststore.com/"); // entering the Url
	}
	
	@Test
	public void t1() {
		// click on apparel & accesories
		driver.findElement(By.xpath("//a[@href=\"https://automationteststore.com/index.php?rt=product/category&path=68\"]")).click();
		// click on the T-shirt
		driver.findElement(By.xpath("(//a[@href=\"https://automationteststore.com/index.php?rt=product/category&path=68_70\"])[2]")).click();
		// click on the 3rd white shirt
		driver.findElement(By.xpath("//*[@id='maincontainer']/div/div/div/div/div[3]/div[3]/div/div/a")).click();
	}
	
	@Test
	public void t2() {
		
		// click on Add to cart
		driver.findElement(By.xpath("//a[@class='cart']")).click();
		// click on checkout
		driver.findElement(By.xpath("//a[@id='cart_checkout1']")).click();
		// click on Guest check out
		driver.findElement(By.xpath("//input[@value='guest']")).click();
		// click on continue
		driver.findElement(By.xpath("//button[@title='Continue']")).click();
		// click on personal details
		driver.findElement(By.id("guestFrm_firstname")).sendKeys("Sharmila");
		driver.findElement(By.id("guestFrm_lastname")).sendKeys("saren");
		driver.findElement(By.id("guestFrm_email")).sendKeys("asghgeue@gmail.com");
		driver.findElement(By.id("guestFrm_telephone")).sendKeys("5621522522");
		driver.findElement(By.id("guestFrm_fax")).sendKeys("hgwygbvhdiln");
		// click on address
		driver.findElement(By.id("guestFrm_company")).sendKeys("ABYFD");
		driver.findElement(By.id("guestFrm_address_1")).sendKeys("akuhddbj");
		driver.findElement(By.id("guestFrm_city")).sendKeys("city");
		driver.findElement(By.id("guestFrm_zone_id")).sendKeys("Angus");
		driver.findElement(By.id("guestFrm_postcode")).sendKeys("522322");
		driver.findElement(By.id("guestFrm_country_id")).sendKeys("Algeria");
		// click on Checkbox 
		driver.findElement(By.id("guestFrm_shipping_indicator")).click();
		// click on continue btn
		driver.findElement(By.cssSelector("[title='Continue']")).click();
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
	}

}
