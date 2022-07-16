package Scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopupMenuRentPeriod extends BasePage{
    private final By selectOneDayNight = By.xpath(".//*[contains(text(),'сутки')]");
    private final By selectTwoDayNight = By.xpath(".//*[contains(text(),'двое суток')]");
    private final By selectThreeDayNight = By.xpath(".//*[contains(text(),'трое суток')]");
    private final By selectFourDayNight = By.xpath(".//*[contains(text(),'четверо суток')]");
    private final By selectFiveDayNight = By.xpath(".//*[contains(text(),'пятеро суток')]");
    private final By selectSixDayNight = By.xpath(".//*[contains(text(),'шестеро суток')]");
    private final By selectSevenDayNight = By.xpath(".//*[contains(text(),'семеро суток')]");

    public PopupMenuRentPeriod(WebDriver driver) {
        super(driver);
    }
    protected RentPage selectRentPeriodInPopupMenu(int periodInDay){
        switch (periodInDay){
            case 1:
                driver.findElement(selectOneDayNight).click();
                break;
            case 2:
                driver.findElement(selectTwoDayNight).click();
                break;
            case 3:
                driver.findElement(selectThreeDayNight).click();
                break;
            case 4:
                driver.findElement(selectFourDayNight).click();
                break;
            case 5:
                driver.findElement(selectFiveDayNight).click();
                break;
            case 6:
                driver.findElement(selectSixDayNight).click();
                break;
            case 7:
                driver.findElement(selectSevenDayNight).click();
                break;
        }

        return new RentPage(driver);
    }
}
