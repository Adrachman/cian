package job.task.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cian extends BasePage {
//    private WebElement rooms = driver.findElement(By.xpath("//div[@data-mark=\"FilterRoomsCount\"]"));
//    private final By countRooms = By.xpath("//div[@data-mark=\"FilterRoomsCount\"]");
//    private final By price = By.xpath("//button[@class=\"_025a50318d--button--A0jv8 _025a50318d--button--empty--QEgGN\"]");

    private final By rent = By.xpath("//a[@href=\"/snyat/\"]");
    private final By searchButton = By.xpath("//a[@class=\"_025a50318d--button--ljPOU\"]");
    private final By adres = By.xpath("//input[@id=\"geo-suggest-input\"]");

    public Cian(WebDriver driver) {
        super(driver);
    }

    public Cian rentApartment(){
        driver.findElement(rent).click();
        driver.findElement(searchButton).click();
        return this;
    }
}
