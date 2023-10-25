package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class SearchPage {
        private final Page page;
        String url;
        Locator cookies;
        Locator search;

        public SearchPage(Page page){
           this.page=page;
           this.url="https://www.willys.se/";
           this.cookies = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Acceptera alla cookies"));
           this.search=page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("Sök i e-handeln"));
        }
        public void search(String searchAudi){
                page.navigate(url);
                cookies.click();
                search.click();
                search.fill("mjölk");
                search.press("Enter");
        }
    }

