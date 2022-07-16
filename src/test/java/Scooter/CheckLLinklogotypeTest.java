package Scooter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class CheckLLinklogotypeTest extends BaseUITest{
    //click logotype
    //ckeck main page scooter (check Header)

    private  final String logotypeName;
    private final String expected;

    public CheckLLinklogotypeTest(String logotypeName, String expected) {
        this.logotypeName = logotypeName;
         this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][]testData(){
        return new Object[][] {
                //{"Yandex","https://yandex.ru/"},
                {"Yandex","https://www.ozon.ru/"},
                {"Scooter","https://qa-scooter.praktikum-services.ru/"},

        };
    }

    @Test
    public void ClickLogotypeCheckPage() {
        driver.get(MainPage.URL);
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLogotype(logotypeName);

        String actual = mainPage.getCurrentUrl();

        assertEquals(actual,expected);
    }

}
