// package demo;

// import java.util.List;
// import java.util.concurrent.TimeUnit;

// import org.openqa.selenium.By;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;

// import io.github.bonigarcia.wdm.WebDriverManager;

// public class Automate_image_urls {
//     ChromeDriver driver;

//     public Automate_image_urls() {
//         System.out.println("Constructor: TestCases");
//         WebDriverManager.chromedriver().timeout(30).setup();
//         driver = new ChromeDriver();
//         driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//     }

//     public void endTest() {
//         System.out.println("End Test: TestCases");
//         driver.close();
//         driver.quit();

//     }


//     public void image_Urls() throws InterruptedException {

//         // open book my show page url | https://in.bookmyshow.com/explore/home/chennai
//         driver.get("https://in.bookmyshow.com/explore/home/chennai");
//         //total number of links present on webpage
//           List<WebElement> links=driver.findElements(By.tagName("a"));
//           int size=links.size();
//           System.out.println(size);

//         // get the tab WebElement of recommended movies in a list Using Locator "XPath"
//         // movies | //h2[contains(text(),'Recommended
//         // Movies')]/parent::div/../../..//img
//         List <WebElement>urls=driver.findElements(By.xpath("//h2[contains(text(),'Recommended Movies')]/parent::div/../../..//img"));
//           int urlsSize=urls.size();
//           System.out.println("total no of urls on this page are :"+ urlsSize);
//         List<WebElement> UrlOfRecoMovies = driver
//         .findElements(By.xpath("//h2[contains(text(),'Recommended Movies')]/parent::div/../../..//img"));
        
//                 // iterate each item from this list and print the href value of each
//         System.out.println(UrlOfRecoMovies.size());
//         for (WebElement urlElement : UrlOfRecoMovies) {
//             System.out.println(urlElement.getAttribute("src"));
//         }
//         Thread.sleep(3000);
       
//         // scroll the page down by using javascript executor
//         JavascriptExecutor jse = (JavascriptExecutor) driver;
//         jse.executeScript("window.scrollBy(0,300)");
       
//         // find the premiere list of movies and get te second movie Using Locator
//         // "XPath" premiere |
//         // //h2[text()='Premieres']/../../../../div[2]/div/div/div[2]/child::a/div/div[3]
//         WebElement movieNameAndLang = driver.findElement(
//     By.xpath("//h2[text()='Premieres']/../../../../div[2]/div/div/div[2]/child::a/div/div[3]"));
//                          //   //h2[text()='Premieres']/../../../../div[2]/div/div/div[2]/child::a/div/div[3] 
//         // get the element of this wenelement by getText method premiere.getText()
//         String nameOfMovie = movieNameAndLang.getText();
//         System.out.println(nameOfMovie);

//     }
// }
