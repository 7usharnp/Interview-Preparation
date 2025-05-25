package seleniumQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.className("nav-cart-icon")).click();
        System.out.println(driver.findElement(By.tagName("h2")).getText());
        driver.navigate().back();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.className("a-button-text")).click();
        driver.navigate().back();
        //driver.

        driver.quit();

    }

}
