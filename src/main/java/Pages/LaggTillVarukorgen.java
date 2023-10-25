package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LaggTillVarukorgen {
        private final Page page;
        String url;
        Locator cookies;
        Locator search;
        Locator plusButton;
        Locator leveranssattButton;
        Locator varukorgen;
        Locator varanIvarukorgen;
        Locator pathElement;



        public LaggTillVarukorgen(Page page){
           this.page=page;
           this.url="https://www.willys.se/";
           this.cookies = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Acceptera alla cookies"));
           this.search=page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Sök i e-handeln"));
           this.plusButton=page.getByTestId("grid").locator("div").filter(new Locator.FilterOptions().setHasText("1690/stMellanmjölk Längre Hållbarhet 1,5%Garant 1,5lJmf-pris 11,27 kr/l")).getByTitle("Öka antal");
        }
        public void tillVarukorgen(String searchAudi){
                page.navigate(url);
                cookies.click();
                search.click();
                search.fill("mjölk");
                search.press("Enter");
                plusButton.click();
        }
}

