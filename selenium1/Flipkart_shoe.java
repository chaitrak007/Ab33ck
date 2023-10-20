import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_shoe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com");
		
		  d.manage().window().maximize();
		  WebElement cancel= d.findElement(By.xpath("(//button[@class='_2KpZ6l _2doB4z'])"));
		     boolean popup= cancel.isDisplayed();
		     if(popup==true) {
		    cancel.click();
		     }
		    
		    WebElement shoe= d.findElement(By.name("q"));
		    shoe.sendKeys("shoe");
		  
		    List<WebElement> shoelist= d.findElements(By.xpath("//input[@class='_3704LK']"));
		    Thread.sleep(5000);
		    int count=shoelist.size();
		  
		    
			System.out.println(count);
			 shoelist.get(count-2).click();
		     }

	}


