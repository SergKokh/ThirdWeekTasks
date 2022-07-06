package FiveClicksRozetka;

import FiveClicksRozetka.Page.HomePage;
import FiveClicksRozetka.Page.LaptopAndComputerPage;
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
        sleep(3);
        lapTopAndComputerPage.getLaptopPage().get(0).click();

    }
}
