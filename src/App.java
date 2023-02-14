import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App{

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
            System.out.println(driver.getTitle());
            WebElement inputBox = driver.findElement(By.id("searchInput"));
            WebElement searchButton = driver.findElement(By.id("searchButton"));
            inputBox.sendKeys("Rihanna");
            searchButton.click();
            searchButton.sendKeys(Keys.ENTER);
            System.out.println(driver.findElement(By.id("footer")).getAttribute("role"));
            driver.findElement(By.id("n-portal")).click();
            List<WebElement> elementosDiv = driver.findElements(By.tagName("div"));
            for (WebElement webElement : elementosDiv) {
                System.out.println(webElement.getText());
            }

            
            
            for (int i = 0; i < elementosDiv.size(); i++) {
                
                System.out.println(elementosDiv.get(i).getText());
            }
            
            Thread.sleep(5000);
        } catch (InterruptedException e) {
             
            e.printStackTrace();
        }
        driver.quit();    
}


@Test

public void test_checkbox(){
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

    WebDriver driver = new ChromeDriver();
    driver.get("index.html");

}

}