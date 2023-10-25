package Pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HittaButik {
    private final Page page;
    String url="https://www.willys.se/";
    Locator cookies;
    Locator hittaButik;
    Locator findStore;
    Locator butik;

   public HittaButik(Page page) {
        this.page =page;
        this.cookies = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Acceptera alla cookies"));
        this.hittaButik= page.getByRole(AriaRole.CONTENTINFO).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Hitta butik"));
        this.findStore= page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("find-store"));;
        this.butik=page.locator("strong:first-of-type");
   }

    public void hittaButik(){
        page.navigate(url);
        cookies.click();
        hittaButik.click();
        findStore.fill("Rissne");
        findStore.press("Enter");

    }

    public Locator getFindStore() {
        return findStore;
    }

    public Locator getButik() {
        return butik;
    }
}
