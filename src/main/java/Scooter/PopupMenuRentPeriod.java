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
    protected RentPage selectRentPeriodInPopupMenu(String periodInDay){
        if(periodInDay.equals("сутки")){
            driver.findElement(selectOneDayNight).click();
        } else if (periodInDay.equals("двое суток")) {
            driver.findElement(selectTwoDayNight).click();
        }else if (periodInDay.equals("трое суток")) {
            driver.findElement(selectThreeDayNight).click();
        } else if (periodInDay.equals("четверо суток")) {
            driver.findElement(selectFourDayNight).click();
        }else if (periodInDay.equals("пятеро суток")) {
            driver.findElement(selectFiveDayNight).click();
        } else if (periodInDay.equals("шестеро суток")) {
            driver.findElement(selectSixDayNight).click();
        }else if (periodInDay.equals("семеро суток")) {
            driver.findElement(selectSevenDayNight).click();
        }
        return new RentPage(driver);
    }
}
