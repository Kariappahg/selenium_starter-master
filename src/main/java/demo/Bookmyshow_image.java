package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Bookmyshow_image
{
    ChromeDriver driver;

    public Bookmyshow_image() 
    {
       System.out.println("Constructor: TestCases");
       WebDriverManager.chromedriver().timeout(30).setup();
        
       driver = new ChromeDriver(); 
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() 
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();
    }

    public void testCase04() throws InterruptedException
    {
         //Visit the link "https://in.bookmyshow.com/explore/home/chennai"
         driver.get("https://in.bookmyshow.com/explore/home/chennai");

         //Find the recommended movies name of using image url in the list
         //int count;

         //List<WebElement> imgURL = driver.findElements(By.xpath("(//div[@class='sc-lnhrs7-0 hCzkOF'])"));

         // Find the image URLs for all the "Recommended Movies"
        // List<WebElement> recommendedMovies = driver.findElements(By.cssSelector(".recommended-movies .slick-slide img"));
        // System.out.println("Recommended Movies Image URLs:");
        // for (WebElement movie : recommendedMovies) {
        //     String imageUrl = movie.getAttribute("src");
        //     System.out.println(imageUrl);
        // }

        //Go to see all in recomonded movies
        WebElement seeallElement = driver.findElement(By.xpath("//div[@id='super-container']/div[2]/div[3]/div[1]/div[1]/div/div/div/div[1]/div/div[2]"));

        seeallElement.click();

        Thread.sleep(3000);
        

        driver.navigate().to("https://in.bookmyshow.com/explore/movies-chennai");
         
        List<WebElement> urlof_Recmovies = driver.findElements(By.xpath("(//div[@class='sc-lnhrs7-0 hCzkOF'])[1]"));
        
        //To get elements which contains the Image link
       List<WebElement> bookmyshowWebElement = driver.findElements(By.className("//div[@class='sc-133848s-2 sc-1t5vwh0-1 TsmVt']//img"));

       for(int n=1; n<=bookmyshowWebElement.size();n++)
       {
            System.out.println("Link:"+bookmyshowWebElement.toString());
       }

       WebElement nameof_Recmovies = driver.findElement(By.xpath("(//img[@class='sc-eykeme-1 jbzDld'])[]"));

         //Using for loop iterator print all the stored values
         for(int count=2; count <= bookmyshowWebElement.size(); count++)
         {
            //(//div[@class='sc-133848s-2 sc-1t5vwh0-1 TsmVt'])
             List<WebElement> imgURL = driver.findElements(By.xpath("(//div[@class=\"sc-133848s-3 sc-133848s-10 hzmTWB\"])"));
            


             String name = nameof_Recmovies.toString();

             System.out.println("Image-URL"+imgURL);
             System.out.println("Name:"+name);
             System.out.println("URL:"+nameof_Recmovies+"count-"+count);
         }

        // driver.switchTo().
         //Locate the Premier category
         for(int count2 = 1;count2<=5; count2++)
        {
            //Movies list in premier category xpath
            List<WebElement> moviesinPremierlist = driver.findElements(By.xpath("(//div[@class='sc-133848s-2 sc-1t5vwh0-1 TsmVt'])[count2]"));
            System.out.println("Movies in Premier category:::::");
            System.out.println(moviesinPremierlist);
        }

        //  for()
        //  WebElement premierCategoryElement = driver.findElement(By.xpath("(//img[@class='sc-eykeme-1 jbzDld'])[6]")); 

        //  //Element is displayed
        //  System.out.println("Premier element is displayed"+premierCategoryElement.isDisplayed());

         //2nd moviename in the Premier list
         WebElement secondMovie = driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 fyTNyu'])[2]"));
         String name = secondMovie.getText();

         System.out.println("2nd movie name in the list"+name);

         //2nd moviename in the Premier list
         WebElement lang = driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 eeVqLW'])[2]"));
         String movie_Lang = lang.getText();
         System.out.println("___movie_Lang_"+movie_Lang);

         System.out.println("2nd movie lang. in the list"+lang);

        
        

        // for(int count3 = 2;count3<=9; count3++)
        // {
        //     List<WebElement> listofLanguages = driver.findElements(By.xpath("(//div[@class='sc-7o7nez-0 eeVqLW'])[count3]"));
        //     System.out.println("Languages:::::");
        //     System.out.println(listofLanguages);
        // }
    }

}