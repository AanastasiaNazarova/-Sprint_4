package Scooter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)

public class OrderScooter  extends BaseUITest{
    private  final String name;
    private  final String surname;
    private  final String adress;
    private  final String metroStation;
    private  final String phoneNumber;
    private  final String date;
    private  final int rentPeriod;
    private  final String preferColor;
    private  final String comment;

    public OrderScooter(String name, String surname, String adress, String metroStation, String phoneNumber, String date, int rentPeriod, String preferColor, String comment) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.rentPeriod = rentPeriod;
        this.preferColor = preferColor;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][]testData(){
        return new Object[][] {
                {"Иван","Петров","улица Шаболовская, дом 10","Октябрьская","89265887434","15.07.2022",3,"black","просьба привезти до 11 утра"},
                {"Мария","Крючкова","улица Московская, дом 4","Рижская","89855887434","24.08.2022",6,"grey","Просьба после 18:00."},
        };
    }

    @Test
    public void checkOrderScooter(){
        boolean isOrderNotFoundImageDisplayed = new MainPage(driver)
                .open()
                .clickOrderButton()
                .fillName(name)
                .fillSurname(surname)
                .fillAddress(adress)
                .fillStationMetro(metroStation)
                .fillPhoneNumber(phoneNumber)
                .clickButtonDalee()
                .setWhen(date)
                .setRenalPeriod(rentPeriod)
                .setColour(preferColor)
                .setComment(comment)
                .clickButtonOrder()
                .clickButtonYes()
                .isOrderNotFoundImageDisplayed();

        assertTrue("Order not found image is not displayed",isOrderNotFoundImageDisplayed);

    }

}

