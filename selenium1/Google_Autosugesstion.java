import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Autosugesstion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		
		  d.get("https://www.google.com");
		  String title= d.getTitle();
		  d.manage().window().maximize();
		WebElement searchbar=  d.findElement(By.name("q"));
		searchbar.sendKeys("india");
		 Thread.sleep(4000);
		  List<WebElement> autolist= d.findElements(By.xpath("//ul[@class='G43f7e'][1]"));
		  int count=autolist.size();
			System.out.println(count);
			autolist.get(count-1).click();
	}

}

		 