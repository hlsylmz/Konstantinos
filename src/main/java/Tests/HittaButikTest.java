package Tests;

import Pages.HittaButik;
import TestBase.TestBase;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HittaButikTest extends TestBase {

    @Test
    void butik(){
        HittaButik butik = new HittaButik(page);
        butik.hittaButik();
        assertThat(butik.getButik()).isVisible();
    }
}
