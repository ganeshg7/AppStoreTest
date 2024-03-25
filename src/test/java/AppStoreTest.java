import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AppStoreTest {
    public static void main(String[] args){
        System.setProperty("webdriver","C:\\Users\\Ganesh G\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaappstore.ccbp.tech");

        //Social Tab
        WebElement socialTab = driver.findElement(By.xpath("//button[contains(text(),'Social')]"));
        socialTab.click();
        List <WebElement> count = driver.findElements(By.xpath("//li[@class='app-item']"));
        if(count.size() == 10){
            System.out.println("Social apps count is correct");
        }else{
            System.out.println("Social apps count is incorrect");
        }

        //Games Tab
        WebElement gamesTab = driver.findElement(By.xpath("//button[contains(text(),'Games')]"));
        gamesTab.click();
        List <WebElement> count2 = driver.findElements(By.xpath("//li[@class='app-item']"));
        if(count2.size() == 10){
            System.out.println("Gaming apps count is correct");
        }else{
            System.out.println("Gaming apps count is incorrect");
        }

        //News Tab
        WebElement newsTab = driver.findElement(By.xpath("//button[contains(text(),'News')]"));
        newsTab.click();
        List <WebElement> count3 = driver.findElements(By.xpath("//li[@class='app-item']"));
        if(count3.size() == 10){
            System.out.println("News apps count is correct");
        }else{
            System.out.println("News apps count is incorrect");
        }

        //Food Tab
        WebElement foodTab = driver.findElement(By.xpath("//button[contains(text(),'Food')]"));
        foodTab.click();
        List <WebElement> count4 = driver.findElements(By.xpath("//li[@class='app-item']"));
        if(count4.size() == 10){
            System.out.println("Food apps count is correct");
        }else{
            System.out.println("Food apps count is incorrect");
        }

        newsTab.click();

        WebElement inputEl = driver.findElement(By.xpath("//input[contains(@class,'search-input')]"));
        inputEl.sendKeys("News");
        List <WebElement> count5 = driver.findElements(By.xpath("//li[@class='app-item']"));
        if(count5.size() == 7){
            System.out.println("News apps count is correct");
        }else{
            System.out.println("News apps count is incorrect");
        }

        List<WebElement> appList = driver.findElements(By.xpath("//p[contains(text(),'News')]"));
        if(appList.size() == 7){
            System.out.println("News");
        }else{
            System.out.println("Search functionality is not as expected");
        }

        driver.quit();




    }
}
