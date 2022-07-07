package FiveClicksRozetka.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LaptopAndComputerPage extends BasePage{
    public LaptopAndComputerPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getLaptopPage() {
        return driver.findElements(By.xpath("//a[@title= 'Ноутбуки']"));
    }

    public WebElement tableLaptopAndComputersVisibile() {
        return driver.findElement(By.xpath("//h1[contains(text(), 'Компьютеры и ноутбуки')]"));
    }
}
