package demo;

import java.util.List;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
//Selenium Imports
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.remote.BrowserType;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;
// import org.openqa.selenium.support.ui.Select;
// ///
import org.openqa.selenium.WebElement;

public class BookMySHow {
    
     
        ChromeDriver driver;

        public  BookMySHow(){
         System.out.println("Constructor: TestCases");
         WebDriverManager.chromedriver().timeout(30).setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

   
public void SearchLinks(){


    // Navigate to url and enter www,bookMyShow.com  https://in.bookmyshow.com/explore/home/chennai

    driver.get("https://in.bookmyshow.com/explore/home/chennai");
    // find all links by tagname a Using Locator "Tag Name" links | a
    List<WebElement> allLinks= driver.findElements(By.tagName("a"));
    // get the size of links   links.getSize()
    int sizeOfAllLinks= allLinks.size();

    //   links.getSize()
      
     System.out.println(sizeOfAllLinks);

}

public void endTest()
{   
    System.out.println("End Test: TestCases");
    driver.close();
    driver.quit();

}

}

