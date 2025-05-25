package seleniumQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class SwagLabs {
    @Test
    public void LoginDemo() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Assert.assertEquals(driver.findElement(By.className("app_logo")).getText(), "Swag Labs");
        List<WebElement> webElementList = driver.findElements(By.cssSelector(".inventory_item"));
        //fetch price of Sauce Labs Backpack
        String productName = "Sauce Labs Backpack";
        for (WebElement el : webElementList) {
            if (el.findElement(By.cssSelector("div.inventory_item_name ")).getText().equals(productName)) {
                System.out.println("Price of " + productName + " is " + el.findElement(By.cssSelector("div.inventory_item_price")).getText());
            }
        }

        //find the costlies product and add to cart
        List<Double> priceList = new LinkedList<>();
        for (WebElement webElement : webElementList) {
            priceList.add(Double.parseDouble(webElement.findElement(By.className("inventory_item_price")).getText().substring(1)));
        }
        Collections.sort(priceList, Collections.reverseOrder());
        double costliesItemPrice = priceList.get(0);

        System.out.println(priceList);
        for (WebElement el : webElementList) {
            if (el.findElement(By.cssSelector("div.inventory_item_price")).getText().contains(String.valueOf(costliesItemPrice))) {
                el.findElement(By.cssSelector("button.btn_inventory")).click();
                Assert.assertEquals(el.findElement(By.cssSelector("button.btn_inventory ")).getText(), "Remove");
                Thread.sleep(2000);
            }
        }
        Assert.assertEquals(driver.findElement(By.cssSelector("span.shopping_cart_badge")).getText(), "1");

        driver.quit();
    }

    @Test
    public void ComponentHandle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElements(By.cssSelector(".nav-item")).get(1).click();
        driver.findElements(By.cssSelector(".dropdown-item")).get(3).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
        driver.findElement(By.id("datepicker")).sendKeys("30/03/1996");
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void dragAndDrop() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement source = driver.findElement(By.tagName("img"));
        WebElement destination = driver.findElement(By.cssSelector("div#box"));
        Actions action = new Actions(driver);
        action.dragAndDrop(source, destination).build().perform();
        Assert.assertTrue(driver.findElement(By.cssSelector("#box > p")).getText().equals("Dropped!"));
    }

    @Test
    public void fileUpload() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");
        String filePath = "C:\\Users\\tushar.nangare\\Downloads\\LeetCode Solutions - With Java.pdf";
        driver.findElement(By.id("file-upload-field")).sendKeys(filePath);
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void newWindowAndAlertHandle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        driver.findElement(By.id("new-tab-button")).click();
        Set<String> windowIds = driver.getWindowHandles();
        Iterator<String> itr = windowIds.iterator();
        while (itr.hasNext()) {
            if (driver.getWindowHandle() != parentWindow) {
                driver.switchTo().window(itr.next());
            }
        }
        Assert.assertTrue(driver.findElement(By.className("display-3")).getText().equals("Welcome to Formy"));
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("alert-button")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.quit();
    }

    //Scroll down
    @Test
    public void scroll() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("windows.scrollBy(0,500)");
        Thread.sleep(5000);
        driver.quit();
    }

    //Select dropdown
    @Test
    public void SelectHandling() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.cssSelector(".product_sort_container")).click();
        Select select = new Select(driver.findElement(By.cssSelector(".product_sort_container")));
        select.selectByVisibleText("Price (low to high)");
        Thread.sleep(5000);

        List<WebElement> sortedByPrice = driver.findElements(By.cssSelector("div.inventory_item_price"));
        List<Double> fetchedList = new LinkedList<>();
        List<Double> sortedList = new LinkedList<>();
        for (WebElement el : sortedByPrice) {
            fetchedList.add(Double.parseDouble(el.getText().substring(1)));
            sortedList.add(Double.parseDouble(el.getText().substring(1)));
        }

        //manually sorted
        Collections.sort(sortedList);
        System.out.println(sortedList);
        System.out.println(fetchedList);
        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.get(i).equals(fetchedList.get(i))) {

            } else {
                throw new Exception("Not sorted ");
            }

        }

    }
}