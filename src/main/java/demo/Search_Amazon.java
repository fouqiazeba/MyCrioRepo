package demo;

//import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.remote.BrowserType;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;
// import org.openqa.selenium.support.ui.Select;




public class Search_Amazon {
   
    ChromeDriver driver;
   public  Search_Amazon(){
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
   
public  void searchAmazon(){
    System.out.println("Start Test case: testCase01");
    driver.get("https://www.google.com");
    WebElement searchBox= driver.findElement(By.name("q"));
    searchBox.clear();
    searchBox.sendKeys("Amazon");
    searchBox.sendKeys(Keys.RETURN);
    boolean result= driver.findElement(By.xpath("//span[text()='Amazon.in' or text()='Amazon.com']")).isDisplayed();
    System.out.println("Result of Amazon search is :" + result);
    System.out.println("end Test case: testCase02");
}
}