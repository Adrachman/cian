import org.testng.annotations.Test;

public class SearchApartment extends BaseTest {

    @Test
    public void testForRedirectToPage(){
        basePage.open("https://samara.cian.ru/");
        cian.rentApartment();
        apartmentsPage.cheapApartment();
        apartmentsPage.getFirstApartment();
    }
}
