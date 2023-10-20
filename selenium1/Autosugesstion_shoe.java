import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugesstion_shoe {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver d = new ChromeDriver();
	 d.get("https://www.amazon.in");
	  String title= d.getTitle();
	  d.manage().window().maximize();
	 WebElement shoe = d.findElement(By.id("twotabsearchtextbox"));
	 shoe.sendKeys("shoes");
	  Thread.sleep(4000);
	 List<WebElement> shoelist =d.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
	 
	int count=shoelist.size();
	System.out.println(count);
	 //shoelist.get(count-1).click();
	shoelist.get(count-1).click();
}
}