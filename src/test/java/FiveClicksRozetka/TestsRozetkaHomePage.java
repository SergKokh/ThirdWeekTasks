package FiveClicksRozetka;

import FiveClicksRozetka.Page.CartPage;
import FiveClicksRozetka.Page.HomePage;
import FiveClicksRozetka.Page.LaptopAndComputerPage;
import FiveClicksRozetka.Page.LaptopPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsRozetkaHomePage extends TestInit{

    @Test
    public void checkLogoVisibile(){
        HomePage homePage = new HomePage(driver);
        homePage.goToRozetka();
        Assert.assertTrue(homePage.logoRozetkaVisibile().isDisplayed());
    }

    @Test
    public void checkLaptopAndComputerPage(){
        HomePage homePage = new HomePage(driver);
        LaptopAndComputerPage lapTopAndComputerPage = new LaptopAndComputerPage(driver);
        homePage.goToRozetka();
        homePage.getLaptopAndComputerPage().click();
        sleep(5);
        lapTopAndComputerPage.getLaptopPage().get(0).click();

        Assert.assertTrue(lapTopAndComputerPage.tableLaptopAndComputersVisibile().isDisplayed());

    }
    @Test
    public void checkAddToCart() {
        HomePage homePage = new HomePage(driver);
        LaptopAndComputerPage laptopAndComputerPage = new LaptopAndComputerPage(driver);
        LaptopPage laptopPage = new LaptopPage(driver);
        CartPage cartPage = new CartPage(driver);
        homePage.goToRozetka();
        homePage.getLaptopAndComputerPage().click();
        sleep(5);
        laptopAndComputerPage.getLaptopPage().get(0).click();
        sleep(2);
        laptopPage.choiseProduct().click();
        sleep(2);
        driveMouse();
        laptopPage. buyBtnClick().click();
        sleep(2);

        Assert.assertTrue(cartPage.productInCart().isDisplayed());
    }
    @Test
    public void checkClearCart(){
        HomePage homePage = new HomePage(driver);
        LaptopAndComputerPage laptopAndComputerPage = new LaptopAndComputerPage(driver);
        LaptopPage laptopPage = new LaptopPage(driver);
        CartPage cartPage = new CartPage(driver);
        homePage.goToRozetka();
        homePage.getLaptopAndComputerPage().click();
        sleep(5);
        laptopAndComputerPage.getLaptopPage().get(0).click();
        sleep(2);
        laptopPage.choiseProduct().click();
        sleep(2);
        driveMouse();
        laptopPage. buyBtnClick().click();
        sleep(5);
        driveMouse();
        laptopPage.getToCart().click();
        cartPage.clickOptionsBtn().click();
        cartPage.clickDeleteBtn().click();
        sleep(3);

        Assert.assertTrue(cartPage.elementEmptyCart().isDisplayed());
    }

}
