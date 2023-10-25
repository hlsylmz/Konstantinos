package Tests;

import Pages.LaggTillVarukorgen;
import TestBase.TestBase;
import org.junit.jupiter.api.Test;

public class LaggTillVarukorgenTest extends TestBase {
    String searchItem="mjölk";
    @ Test
    void laggTillTest() {
        LaggTillVarukorgen laggTill= new LaggTillVarukorgen(page);
        laggTill.tillVarukorgen(searchItem);
    }
}
