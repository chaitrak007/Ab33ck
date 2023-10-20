import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
	  ChromeDriver d = new ChromeDriver();
	
	  d.get("https://www.naukri.com");
	  String title= d.getTitle();
	  System.out.println(title);
	  d.get("https://www.facebook.com");
	  String title1= d.getTitle();
	  System.out.println(title1);
	  Thread.sleep(5000);
	 
	 
	  d.quit();
	  //d.close();

	}

}
