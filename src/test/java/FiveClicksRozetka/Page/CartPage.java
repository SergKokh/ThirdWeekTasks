package FiveClicksRozetka.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement productInCart() {
        return driver.findElement(By.xpath("//a[@class= 'cart-product__title']"));
    }

    public WebElement clickOptionsBtn() {
        return driver.findElement(By.xpath("//button[@id= 'cartProductActions0']"));
    }

    public WebElement clickDeleteBtn() {
        return driver.findElement(By.xpath("//button[contains(text(), ' Удалить ')]"));
    }

    public WebElement elementEmptyCart() {
        return driver.findElement(By.xpath("//img[@class= 'cart-dummy__illustration']"));
    }

    public WebElement selectBuyInCredit() {
        return driver.findElement(By.xpath("//button[@class= 'button button--medium button--navy ng-star-inserted']"));
    }
}
