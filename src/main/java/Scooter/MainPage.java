package Scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
public class MainPage extends BasePage  {
   public  static final String URL ="https://qa-scooter.praktikum-services.ru/";

    private final By buttonOrded  = By.className("Button_Button__ra12g");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonQuestion(String button_id, String panel_id){
     By button=By.id(button_id);
     WebElement  element= driver.findElement(button);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, 3)
             .until(ExpectedConditions.visibilityOfElementLocated(By.id(panel_id)));
     }

 public String getTextFromPanelАnswer(String button_id) {
  By panelАnswer=By.id(button_id);
     return driver.findElement(panelАnswer).getText();
    }

    public MainPage open(){
     driver.get(URL);
     return this;
    }

    public OrderFillFormPersonalDataPage clickOrderButton(){
        driver.findElement(buttonOrded).click();
        return  new OrderFillFormPersonalDataPage(driver);

    }
}
