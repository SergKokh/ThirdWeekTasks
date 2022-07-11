package FiveClicksRozetka.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToRozetka(){
        driver.get("https://rozetka.com.ua/");
    }

    public WebElement logoRozetkaVisibile() {
        return driver.findElement(By.xpath("//img[@alt= 'Rozetka Logo']"));
    }

    public WebElement getLaptopAndComputerPage() {
        return driver.findElement(By.xpath("//div[@class='fat-wrap']//li[1]//a[1]"));
    }


}
