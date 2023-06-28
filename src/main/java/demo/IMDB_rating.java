package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IMDB_rating {

  ChromeDriver driver;

  public IMDB_rating() {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

        public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();
    }

public void testCase08() throws InterruptedException {
    
		ChromeOptions option= new ChromeOptions();    
		option.addArguments("--remote-allow-origins=*");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Crio Selenium\\Selenium_practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://www.imdb.com/chart/top");
		WebElement dropDown= driver.findElement(By.xpath("//select[@name='sort']"));
		dropDown.click();
		Select sel = new Select(dropDown);
		sel.selectByVisibleText("IMDb Rating");
        Thread.sleep(2000);
        
		
		//String text= driver.findElement(By.xpath("//a[text()='The Shawshank Redemption']")).getText();

        WebElement title_of_Movie = driver.findElement(By.xpath("//tbody[@class='lister-list']//tr[1]//a[@title]"));
        String text = title_of_Movie.getText();
		System.out.println("Highest rated movie on Imdb="+text);

        Thread.sleep(3000);
		
		String count= driver.findElement(By.xpath("(//span[text()='250'])[1]")).getText();
		System.out.println("movies are included in the table="+count);
		

        // WebElement clickonDescendingElement = driver.findElement(By.xpath("//span[@class='global-sprite lister-sort-reverse descending']"));
		// clickonDescendingElement.click();
        //sel.selectByValue("us:descending");

        //oldeest movie in the list
        Thread.sleep(3000);
        WebElement dropDownoption= driver.findElement(By.xpath("//select[@name='sort']"));
		dropDown.click();
        Thread.sleep(2000);
		Select oldest = new Select(dropDown);
		sel.selectByVisibleText("Release Date");
        Thread.sleep(2000);
        WebElement oldToNew = driver.findElement(By.xpath("//*[@id='main']/div/span/div[1]/div/div[3]/div/div/div[1]/span"));
        oldToNew.click();
        Thread.sleep(2000);

        WebElement title_of_Oldest_Movie = driver.findElement(By.xpath("//*[@id=\"main\"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a"));
        String OledstMovietitle = title_of_Oldest_Movie.getText();
		System.out.println("Oldest movie on Imdb="+OledstMovietitle);
        Thread.sleep(2000);

		// sel.selectByValue(count);
		// String oldMovie= driver.findElement(By.xpath("//a[text()='The Kid']")).getText();
		// System.out.println("oldest movie on the list is="+oldMovie);

        //Most recent movie from the rating list
        WebElement NewtoOld = driver.findElement(By.xpath("//*[@id='main']/div/span/div[1]/div/div[3]/div/div/div[1]/span"));
        NewtoOld.click();
        Thread.sleep(2000);

        // WebElement clickonAssendingElement = driver.findElement(By.xpath("//span[@class='global-sprite lister-sort-reverse descending']"));
		// clickonAssendingElement.click();
		
		String mostRecentMovie = driver.findElement(By.xpath("//*[@id=\"main\"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a")).getText();
		System.out.println("most recent movie on the list is="+mostRecentMovie);
        Thread.sleep(2000);
		
        //Most highly rated movie by users

        WebElement drop= driver.findElement(By.xpath("//select[@name='sort']"));
		dropDown.click();
        Thread.sleep(2000);
		Select Rating = new Select(dropDown);
		sel.selectByVisibleText("Your Rating");
        Thread.sleep(2000);

		
		String userRating= driver.findElement(By.xpath("//*[@id=\"main\"]/div/span/div[1]/div/div[3]/table/tbody/tr[1]/td[2]/a")).getText();
		System.out.println("The movie has the most user ratings is="+userRating);

   }
}