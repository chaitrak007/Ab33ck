import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		 d.get("https://www.flipkart.com");
		  String title= d.getTitle();
		  d.manage().window().maximize();
	     WebElement cancel= d.findElement(By.xpath("(//button[@class='_2KpZ6l _2doB4z'])"));
	     boolean popup= cancel.isDisplayed();
	     if(popup==true) {
	    cancel.click();
	     }
	    Thread.sleep(5000);
	     WebElement fashion= d.findElement(By.xpath("//img[@alt='Fashion']"));
	     Actions a1=new Actions(d);
		a1.moveToElement(fashion).perform();
		WebElement tshirt=d.findElement(By.linkText("Men T-Shirts"));
		//WebElement tshirt=d.findElement(By.xpath("//div[@class='_1GTrm1'][7]/a[6]"));
		tshirt.click();
		

	}

}
