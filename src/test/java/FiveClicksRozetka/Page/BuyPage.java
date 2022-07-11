package FiveClicksRozetka.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyPage extends BasePage{
    public BuyPage(WebDriver driver) {
        super(driver);
    }

    public WebElement buyInCredit() {
        return driver.findElement(By.xpath("//h3[contains(text(), 'Кредит')]"));
    }
}
