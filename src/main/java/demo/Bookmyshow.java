package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bookmyshow {


    ChromeDriver driver = new ChromeDriver();

    public Bookmyshow() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

      public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void testCase02() {

        // ChromeDriver driver;
        
        
       //Visit the link "https://in.bookmyshow.com/explore/home/chennai"
       driver.get("https://in.bookmyshow.com/explore/home/chennai");

       //To get elements which contains the url
       List<WebElement> bookmyshowWebElement = driver.findElements(By.tagName("a"));
      //WebElement elementscontaining_Tagname;
       for(WebElement elementscontaining_Tagname:bookmyshowWebElement)
       {
            
            
            //*[@id="https://in.bookmyshow.com/chennai/movies/por-thozhil/ET00357691-0"]
            // if(bookmyshowWebElement.contains(str))
            // {
            //     
            // }
            System.out.println("Link:"+elementscontaining_Tagname.getAttribute("href"));
       } 
       System.out.println("Down Count of links:"+bookmyshowWebElement.size());   
    }
}