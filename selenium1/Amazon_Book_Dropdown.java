import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Book_Dropdown {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		 d.get("https://www.amazon.in");
		  String title= d.getTitle();
		  d.manage().window().maximize();
	 WebElement dropdown=   d.findElement(By.id("searchDropdownBox"));
      Select s1= new Select(dropdown);
      List <WebElement> op = s1.getOptions();
      int size = op.size();
      for(int i =0; i<size ; i++){
         String options = op.get(i).getText();
         System.out.println(options);
      }
      /*s1.selectByVisibleText("Books");
      WebElement BookName =d.findElement(By.id("twotabsearchtextbox"));
      BookName.sendKeys("Avatar");
      BookName.sendKeys(Keys.ENTER);
     
       d.findElement(By.partialLinkText("Avatar")).click();*/
	}

}
