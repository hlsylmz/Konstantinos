package Pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class GetTitle {
    private final Page page;
    String url="https://www.willys.se/";
    Locator cookies;
    String title;
   public GetTitle(Page page) {
        this.page =page;
        this.cookies = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Acceptera alla cookies"));
        this.title="Handla billig mat online | Willys";
    }
    public void openAndGetTitle(){
        page.navigate(url);
        cookies.click();
        page.title();
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
