package Scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderStatusPage extends BasePage{
    private final  By orderNotFoundImage = By.className("Header_Header__214zg Header_Flipped__3Wwz5");

    public OrderStatusPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOrderNotFoundImageDisplayed(){
        return driver.findElement(orderNotFoundImage).isDisplayed();
    }


}
