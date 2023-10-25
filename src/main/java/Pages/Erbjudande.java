package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class Erbjudande {
    private final Page page;
    String url="https://www.willys.se/";
    Locator cookies;
    Locator erbjudanden;
    Locator sokButik;
    Locator butik;
    Locator soktButik;


   public Erbjudande(Page page) {
        this.page =page;
        this.cookies = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Acceptera alla cookies"));
        this.erbjudanden= page.getByRole(AriaRole.CONTENTINFO).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Erbjudanden"));
        this.butik=page.locator("a[href='/erbjudanden/butik']");
        this.sokButik=page.getByPlaceholder("Sök efter din butik");
        this.soktButik=page.locator("strong:first-of-type");

   }

    public void hittaErbjudanden(){
        page.navigate(url);
        cookies.click();
        erbjudanden.click();
        butik.click();
        sokButik.fill("Rissne");
        sokButik.press("Enter");
        sokButik.click();

    }

    public Locator getSoktButik() {
        return soktButik;
    }
}
