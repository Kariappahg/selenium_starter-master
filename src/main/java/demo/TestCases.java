package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    ChromeDriver driver;
    public TestCases()
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

    
    public  void testCase01(){
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase01");
    }


     public  void testCase02(){
        System.out.println("Start Test case: testCase02");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase02");
    }

      public  void testCase03(){
        System.out.println("Start Test case: testCase03");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase03");
    }

      public  void testCase04(){
        System.out.println("Start Test case: testCase04");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase04");
    }

        public  void testCase05(){
        System.out.println("Start Test case: testCase05");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase05");
    }

        public  void testCase06(){
        System.out.println("Start Test case: testCase06");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase06");
    }


        public  void testCase07(){
        System.out.println("Start Test case: testCase07");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase07");
        
    }

        public  void testCase08(){
        System.out.println("Start Test case: testCase08");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase08");
        }

        public  void testCase09(){
        System.out.println("Start Test case: testCase09");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase09");
    }

}