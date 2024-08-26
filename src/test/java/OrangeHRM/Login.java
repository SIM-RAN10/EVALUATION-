package OrangeHRM;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:/opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(10000);
		// enter the username
		driver.findElement(By.name("username")).sendKeys("Admin");
		// enter the password
		driver.findElement(By.name("password")).sendKeys("admin123");
		// click on login
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(10000);
		// click on Admin
		driver.findElement(By.linkText("Admin")).click();
//        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ran");
//        driver.findElement(By.xpath("//div[@class='oxd-auutocomplete-option' and .='Ranga Akunuri']")).click();
//        Thread.sleep(1000);
        // click on Webtable
        WebElement List = driver.findElement(By.xpath("(//div[@role='row'])/div[4]/div"));
        WebElement List1 = driver.findElement(By.xpath("(//div[@role='row'])/div[5]/div"));
//        for(int i=1;i<List.size();i++) {
//        	
//        	if(List.get(i).getText().trim().equals("James Butler")&& List1.get(i).getText().trim().equals("enabled")) {
//        		
//        	}
        }
        
		
		

	}


