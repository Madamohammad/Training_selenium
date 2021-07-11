import java.util.*;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class jars {

	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\923388\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		
		/*wd.get("https://www.google.com");
		wd.navigate().to("https://www.google.com/");
		wd.findElement(By.name("q")).sendKeys("Panda Images");
		wd.findElement(By.name("q")).sendKeys(Keys.ENTER);
		wd.navigate().refresh();
		wd.quit();*/
		
		
		/*wd.get("https://artoftesting.com/samplesiteforselenium");
		String text=wd.findElement(By.xpath("//h1[contains(text(),'Demo Website for Automation Testing')]")).getText();
		System.out.println(text);*/
		/*
		wd.get("https://demo.opencart.com/admin/index.php?route=common/login");
		Scanner c=new Scanner(System.in);
		System.out.println("Enter user name");
		String d =c.next();
		System.out.println("Enter password");
		String o=c.next();
		wd.findElement(By.id("input-username")).clear();
		wd.findElement(By.id("input-username")).sendKeys(d);
		wd.findElement(By.id("Enter password")).clear();
		wd.findElement(By.id("Enter password")).sendKeys(o);
        wd.findElement(By.xpath("//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")).click(); */
		
		
		
		
		
		wd.get("https://testsheepnz.github.io/BasicCalculator.html");
		wd.findElement(By.name("number1")).clear();
		wd.findElement(By.name("number1")).sendKeys("6");
		wd.findElement(By.name("number2")).clear();
		wd.findElement(By.name("number2")).sendKeys("6");
		   WebElement testDropDown = wd.findElement(By.id("selectOperationDropdown"));  
		   Select dropdown = new Select(testDropDown);  
		   
		   dropdown.selectByIndex(4);  
		   
		   wd.findElement(By.xpath("//input[@id='calculateButton']")).click();
		   WebElement l = wd.findElement(By.xpath("//input[@id='numberAnswerField']"));
		   String val = l.getAttribute("value");
		   System.out.println("Entered text is: " + val);
	}
	
}
