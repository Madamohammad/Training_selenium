import java.util.List;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class printelement2 {
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\923388\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://demoqa.com/books");
        Thread.sleep(1000);
        
        List<WebElement> li = wd.findElements(By.className("rTableCell"));
        System.out.println("Total rows are: "+li.size());
        
        Iterator<WebElement> it = li.iterator();
        
        while( it.hasNext())
        {
            WebElement item =it.next();
            String link = item.getText();
            System.out.println("Links are"+link);    
            
        }
	}
}
