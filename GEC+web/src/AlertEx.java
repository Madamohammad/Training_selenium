import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
public class AlertEx {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\923388\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement we=wd.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		we.click();
		Alert al =wd.switchTo().alert();
		String st=al.getText();
		System.out.println("The Text in the alert - box is: "+st);
		al.dismiss();
		wd.close();
}
}