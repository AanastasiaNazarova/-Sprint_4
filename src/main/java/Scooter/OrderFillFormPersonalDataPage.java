package Scooter;


 import org.openqa.selenium.Keys;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderFillFormPersonalDataPage extends BasePage {
    private final By fillName = By.xpath(".//input[@placeholder = '* Имя']");;
    private final By fillSurname = By.xpath(".//input[@placeholder = '* Фамилия']");
    private final By fillAddress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private final By metroStationList = By.xpath(".//input[@class='select-search__input']");
    private final By fillStationMetro = By.xpath(".//input[@class='select-search__input']");
    private final By fillPhoneNumber = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");

    private final By buttonDalee = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public OrderFillFormPersonalDataPage(WebDriver driver) {
        super(driver);
    }

    public OrderFillFormPersonalDataPage fillName(String name){
        driver.findElement(fillName).sendKeys(name);
        return this;
    }
    public OrderFillFormPersonalDataPage fillSurname(String surname){
        driver.findElement(fillSurname).sendKeys(surname);
        return this;
    }
    public OrderFillFormPersonalDataPage fillAddress(String Address){
        driver.findElement(fillAddress).sendKeys(Address);
        return this;
    }
    public OrderFillFormPersonalDataPage fillStationMetro(String StationMetro){
        driver.findElement(metroStationList).click();
        driver.findElement(fillStationMetro).sendKeys(StationMetro + Keys.ARROW_DOWN + Keys.ENTER);
        return this;

    }
    public OrderFillFormPersonalDataPage fillPhoneNumber(String PhoneNumber){
        driver.findElement(fillPhoneNumber).sendKeys(PhoneNumber);
        return this;
    }

    public RentPage clickButtonDalee(){
        driver.findElement(buttonDalee).click();
        return new RentPage(driver);
    }

}
