package demo;

// import java.util.List;
// import java.util.concurrent.TimeUnit;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.interactions.internal.MouseAction.Button;

// import io.github.bonigarcia.wdm.WebDriverManager;
// import net.bytebuddy.asm.Advice.Enter;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkedin {

        ChromeDriver driver;
    // ChromeDriver driver = new ChromeDriver();

      public Linkedin() {
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

    public void testCase03() {

        String extractText;

       //Visit https://in.linkedin.com/ 
       driver.get("https://www.linkedin.com/home");
      // driver.get("https://in.bookmyshow.com/explore/home/chennai");
    
       //Maximise the window
    //    driver.manage().window().maximize();

       //Enter Username
       WebElement userName = driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
       
       //Locating username field
       userName.sendKeys("adhikariappa@gmail.com");

       //Locating password field
       WebElement passWord = driver.findElement(By.xpath("//*[@id=\"session_password\"]"));
       
       //Enter Password
       passWord.sendKeys("Kariappa@1722");

       //Click on Sign-in
       WebElement signinBtn = driver.findElement(By.xpath("//*[@id='main-content']/section[1]/div/div/form[1]/div[2]/button"));

       //Clicking on Sign-in button
       signinBtn.click();

       //Click on drop-down icon on the right side
    //    WebElement dropdown_RHS = driver.findElement(By.xpath("//*[@class='global-nav_icon global-nav_icon--small']"));

    //    //Clicking on Dropdown-Icon
    //    dropdown_RHS.click();

        //Locating the Linked-in icon
        WebElement locateIcon = driver.findElement(By.xpath("(//a[@class='app-aware-link '])[1]"));

        //Clicking on the Linked-in icon
        locateIcon.click();

        //Wait of 5seconds
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        //Get the count of Profile viewers
        WebElement profileviewersCount = driver.findElement(By.xpath("(//span[@class='feed-identity-widget-item__stat'])[2]"));

        //Get the text
        extractText = profileviewersCount.getText();
        
        //Printing the Count
        System.out.println("Count of Profile viewers:"+extractText);

        //Locating the Linked-in icon
        WebElement locate_linkedin_Icon = driver.findElement(By.xpath("(//a[@class='app-aware-link '])[1]"));

        //Clicking on the Linked-in icon
        locate_linkedin_Icon.click();

        //To post on Linked-in locate the Start a post field
        WebElement start_a_Post = driver.findElement(By.xpath("//button[@class='artdeco-button artdeco-button--muted artdeco-button--4 artdeco-button--tertiary ember-view share-box-feed-entry__trigger']"));

        //Clicking Start a post
        start_a_Post.click();

        //Typing a post
        start_a_Post.sendKeys("Hi Everyone.");

        //Selecting Who can see your post in Dropdown
        WebElement selectDropdown = driver.findElement(By.xpath("//*[@class='share-unified-settings-entry-button__chevron-icon']"));

        //Clicking on Dropdown
        selectDropdown.click();

        //Selecting Contacts only in radiobutton
        WebElement radio_button_ContactsOnly = driver.findElement(By.xpath("(//div[@class='sharing-shared-generic-list__item'])[2]"));

        //Clicking on radio button
        radio_button_ContactsOnly.click();

        //Finding on Done Webelement
        WebElement done_Button = driver.findElement(By.xpath("(//span[@class=\"artdeco-button__text\"])[3]"));

        //Clicking on Done
        done_Button.click();

        //Finding the field to post 
        WebElement typeText = driver.findElement(By.xpath("//*[@id='ember585']/div/div[2]/div[1]/div/div/div/div/div/div/div[1]"));
        
        //Sending the keys
        typeText.sendKeys("Hi");

        //Clicking on Post button
        WebElement button_Post = driver.findElement(By.xpath("//div[@class='share-box_actions']"));

        

        //Clicking on Post
        button_Post.click();
    }
}