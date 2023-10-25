package Tests;
import Pages.SearchPage;
import TestBase.TestBase;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class SearchPageTest extends TestBase {
    String searchItem="mjölk";
    @ Test
    void sTest() {
        SearchPage sok= new SearchPage(page);
        sok.search(searchItem);
        assertThat(page).hasURL("https://www.willys.se/sok?q=mj%C3%B6lk");
    }
}
