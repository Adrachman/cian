package job.task.home;

import job.task.fileBuld.FileBuld;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofSeconds;

public class ApartmentsPage extends BasePage {
    private final By sortButton = By.xpath("//button[@data-mark=\"SortDropdownButton\"]");
    private final By sortForCheapButton = By.xpath("//select[@class=\"_93444fe79c--native-select--hY7wD\"]/option[@value='price_object_order']");
    private final By cheapApartment = By.xpath("//article[@data-name=\"CardComponent\"]");

    public ApartmentsPage(WebDriver driver) {
        super(driver);
    }
    public ApartmentsPage cheapApartment(){
        driver.findElement(sortButton).click();
        driver.findElement(By.xpath("//div[text()='По цене (сначала дешевле)']")).click();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public void getFirstApartment(){
        List<WebElement> apartments = driver.findElements(By.xpath("//article[@data-name=\"CardComponent\"]"));
        System.out.println(apartments.get(0).getText());
        FileBuld.getFile();
        FileBuld.putFile(apartments.get(0).getText());
    }


}











//        driver.findElement(sortForCheapButton).click();

//        List<WebElement> apartments = driver.findElements(By.xpath("//article[@data-name=\"CardComponent\"]"));
//        apartments.stream().forEach(s-> System.out.println(s.getText()));

//        Select select = new Select(driver.findElement(By.xpath("//div[@class=\"_93444fe79c--select--ndCyd\"]")));
//        select.selectByVisibleText("По цене (сначала дешевле)");
//        select.selectByIndex(1);

//        List<WebElement> apartments = driver.findElements(By.xpath("//div[@data-name=\"SelectPopup\"]"));
//        List<WebElement> apartments = driver.findElements(By.xpath("//div[@data-name=\"SummaryButtonWrapper\"][1]"));
//        WebElement element = apartments.get(0);
//        System.out.println(element.getText());

//        List<WebElement> elements;
////        WebElement element = apartments.forEach(x->x.getAttribute("class"));
//        WebElement s;
//        apartments.stream().forEach(x->elements.add(x.getAttribute();
//        WebElement element1 = apartments.stream().filter(x->x.getText().endsWith("asdad"));
//        apartments.stream().forEach(x->str.add(x.getAttribute())).e;
