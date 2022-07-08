package FiveClicksRozetka.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.ListResourceBundle;

public class LaptopPage extends BasePage{
    public LaptopPage(WebDriver driver) {
        super(driver);
    }


    public WebElement choiseProduct() {
        return driver.findElement(By.xpath("//span[contains(text(),'Ноутбук Acer Aspire 7 A715-42G-R0VS (NH.QBFEU.00A)')]"));
    }


    public WebElement buyBtnClick () {
            return driver.findElement(By.xpath("//button[@aria-label='Купить']//span[@class='buy-button__label ng-star-inserted']"));
        }

    public WebElement getToCart() {
        return driver.findElement(By.xpath("//button[@class='header__button ng-star-inserted header__button--active']//*[name()='svg']"));
    }
}

