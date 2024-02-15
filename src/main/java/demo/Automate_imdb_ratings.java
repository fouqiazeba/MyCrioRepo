package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automate_imdb_ratings {
    ChromeDriver driver;
    Automate_imdb_ratings(){
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
   
   public void imdb() throws InterruptedException{
    driver.get("https://www.imdb.com/chart/top");
    
    JavascriptExecutor jse = (JavascriptExecutor) driver;
   jse.executeScript("window.scrollBy(0,150)");
       
    WebElement dropdown=driver.findElement(By.cssSelector("#sort-by-selector"));
   // dropdown.click();
    //What is the highest rated movie on IMDb?
    Select select=new Select(dropdown);
  // System.out.println(select.getOptions());
  Thread.sleep(1000);
  List<WebElement> options =select.getOptions() ;
  int sizeOfOptions = options.size();
  //if(options.size()>1 ) { boolean s=true;}else  s =false;
  System.out.println(sizeOfOptions+" is sizeOfOptions");
   Thread.sleep(3000);
     select.selectByVisibleText("Number of ratings");
     System.out.println("selected based on ranking ");
    Thread.sleep(3000);
    List<WebElement> movies=driver.findElements(By.xpath("//ul[@class='ipc-metadata-list ipc-metadata-list--dividers-between sc-71ed9118-0 kxsUNk compact-list-view ipc-metadata-list--base']/li"));
    WebElement topRankingMovie=movies.get(0).findElement(By.tagName("h3"));                  // //li[@class='ipc-metadata-list-summary-item sc-bca49391-0 eypSaE cli-parent'][1]//h3
    String topRankMovie=topRankingMovie.getText();
    System.out.println("Top ranking movie is :"+ topRankMovie);

    //How many movies are included in the table?
    int totalMoviesInTable=movies.size();
    System.out.println("Total movies in table are :"+totalMoviesInTable);

    //What is the oldest movie on the list?
      WebElement againdropdown=  driver.findElement(By.cssSelector("#sort-by-selector"));
      againdropdown.click();

      select.selectByVisibleText("Release date");
     Thread.sleep(3000);
     System.out.println("drop down clicked on release date");
         List<WebElement> moviesBasedOnReleaList=driver.findElements(By.xpath("//ul[@class='ipc-metadata-list ipc-metadata-list--dividers-between sc-71ed9118-0 kxsUNk compact-list-view ipc-metadata-list--base']/li"));

     Thread.sleep(3000);
    WebElement oldest=moviesBasedOnReleaList.get(0).findElement(By.tagName("h3")); 
    String oldestMovie=oldest.getText();
    System.out.println("oldest movie is "+ oldestMovie);

    //What is the latest  movie on the list?

     WebElement newest =moviesBasedOnReleaList.get(moviesBasedOnReleaList.size()-1).findElement(By.tagName("h3"));
     String newestMovie=newest.getText();
     System.out.println(" most recent movie is :" + newestMovie);

     // Which movie has the most user ratings?
           WebElement onceagaindropdown=  driver.findElement(By.cssSelector("#sort-by-selector"));

       onceagaindropdown.click();

        select.selectByVisibleText("IMDb rating");
         Thread.sleep(3000);
    List<WebElement> moviesBasedOnuserRating=driver.findElements(By.xpath("//ul[@class='ipc-metadata-list ipc-metadata-list--dividers-between sc-71ed9118-0 kxsUNk compact-list-view ipc-metadata-list--base']/li"));

    WebElement mostRated=moviesBasedOnuserRating.get(0).findElement(By.tagName("h3")); 
    String mostRatedMovie=mostRated.getText();
    System.out.println("Most rated movie is.. "+ mostRatedMovie);
   }
}
