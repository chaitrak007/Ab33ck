import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jsamhtml {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		 d.get("file:///Users/chaitrakulkarni/Downloads/learningHTML1.html");
		  d.getTitle();
		
		  
		  WebElement username=   d.findElement(By.id("1"));
		  username.sendKeys("Chaitra");
		  WebElement hint=   d.findElement(By.id("2"));
		  hint.sendKeys("Chai");
		  WebElement pass=   d.findElement(By.id("3"));
		  pass.sendKeys("@12345");

		  WebElement fname=   d.findElement(By.name("fname"));
		  fname.sendKeys("chaitra");
		  d.findElement(By.id("123")).click();
		
		  d.findElement(By.id("121")).click();
		  d.findElement(By.id("321")).click();
		 
		  WebElement dropdown=   d.findElement(By.id("Relegion"));
	      Select s1= new Select(dropdown);
	      s1.selectByVisibleText("Religion 4");
	    WebElement male= d.findElement(By.xpath("(html/body/input)[4]"));
		 male.click();
		 WebElement female= d.findElement(By.xpath("(html/body/input)[5]"));
		 female.click();
		 WebElement girl= d.findElement(By.xpath("(html/body/form/input)[5]"));
		 girl.click();
		 

	}

}
