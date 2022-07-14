package Scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RentPage extends BasePage{

    private String colour;
    private final By setWhen= By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    private final By RentalPeriodDropdownMenu= By.className("Dropdown-placeholder");
    //private final By setRentalPeriod= By.class("Dropdown-placeholder");

    private final By setColourBlack= By.className("Checkbox_Input__14A2w");
    private final By setColourGrey= By.className("Checkbox_Label__3wxSf");
    private final By setComment= By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    private final By buttonOrder= By.xpath(".//*[contains(text(),'Заказать')]");
    public RentPage(WebDriver driver) {
        super(driver);
    }

    public RentPage setWhen (String data){
        driver.findElement(setWhen).sendKeys(data+ Keys.ENTER);
        return this;
    }
    public RentPage setRenalPeriod (String RentalPeriod){
        driver.findElement(RentalPeriodDropdownMenu).click();

        PopupMenuRentPeriod PopupMenuRentPeriod = new PopupMenuRentPeriod(driver);
        PopupMenuRentPeriod.selectRentPeriodInPopupMenu(RentalPeriod);

        //driver.findElement(setRentalPeriod).click();
        return this;
    }

    public RentPage setColour (String colour){
        if (colour.equals("grey")) {
            driver.findElement(setColourBlack).click();
             }else if (colour.equals("black")) {
            driver.findElement(setColourBlack).click();
        }
        return this;
    }
    public RentPage setComment (String comment){
        driver.findElement(setComment).sendKeys(comment);
        return this;
    }

    public ConfirmOrderPage clickButtonOrder (){
        driver.findElement(buttonOrder).click();
        return new ConfirmOrderPage(driver);
    }

}
