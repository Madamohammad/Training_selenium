
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebElement;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.Alert;
import java.util.List;
import java.util.Iterator ;
public class Ex2 {

	

		public static void main(String[] args)
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\923388\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver wd=new ChromeDriver();
    wd.get("https://demoqa.com/broken");
    List<WebElement> links = wd.findElements(By.tagName("a"));
    System.out.println("Number of Links are: "+links.size());
    
    
      Iterator<WebElement> it = links.iterator(); while( it.hasNext()) 
      { 
          WebElement item =it.next(); String link = item.getText();
          System.out.println("Links are "+link);
      
      }
     
    
    //for(int i=0;i<links.size();i++)
  //  {
     //   WebElement e = links.get(i);
      //  String url =e.getAttribute("href");
    //    verifyLinks(url);
    }
    
        //wd.close();
    
	private static void verifyLinks(String linkurl) {
        // TODO Auto-generated method stub
        try
        {
            URL url = new URL(linkurl);
            //create url cnnection and get response code
            HttpsURLConnection httpURLConnect = (HttpsURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(2000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
                System.out.println(linkurl+ " : " +httpURLConnect.getResponseMessage()+" is a broken Link");
            }
            else
            {
                System.out.println(linkurl+ " : " +httpURLConnect.getResponseMessage());
            }
        }
        catch (Exception e) {
            // TODO: handle exception
        }
	} 
}
