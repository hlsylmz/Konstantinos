package Tests;

import Pages.GetTitle;
import TestBase.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTitleTest extends TestBase {

    @Test
    void GetTitle(){
        GetTitle title= new GetTitle(page);
        title.openAndGetTitle();
        assertEquals(title.getTitle(), page.title());
    }
}
