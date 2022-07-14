package Scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmOrderPage extends BasePage{
    private final By buttonYes = By.className("Header_Header__214zg Header_Flipped__3Wwz5");


    public ConfirmOrderPage(WebDriver driver) {
        super(driver);
    }

    public OrderStatusPage clickButtonYes(){
        driver.findElement(buttonYes).click();
        return new OrderStatusPage(driver);
    }
}
