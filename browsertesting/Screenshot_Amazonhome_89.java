package browsertesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Screenshot_Amazonhome_89 {
	public void screen() throws IOException {
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
			TakesScreenshot ts=	driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("/Users/chaitrakulkarni/eclipse-workspace/Naukari/ScreenShot//chaitra"+Math.random()+".png");
			FileUtils.copyFile(source, destination);
	}
}
