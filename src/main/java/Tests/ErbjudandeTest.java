package Tests;

import Pages.Erbjudande;
import TestBase.TestBase;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ErbjudandeTest extends TestBase {

    @Test
    void getErbjudanden(){
        Erbjudande erbjudande= new Erbjudande(page);
        erbjudande.hittaErbjudanden();
        assertThat(erbjudande.getSoktButik()).isVisible();
    }
}
