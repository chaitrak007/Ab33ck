package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeoutInTestNg {
@Test(timeOut=30000)
public void testcase1()
{
	ChromeDriver d = new ChromeDriver();
	
	  d.get("https://www.google.in");
	  String title= d.getTitle();
	  d.manage().window().maximize();
	  d.findElement(By.linkText("Images")).click();
	  d.findElement(By.id("APjFqb")).sendKeys("india");
	  d.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);

	
}
}
