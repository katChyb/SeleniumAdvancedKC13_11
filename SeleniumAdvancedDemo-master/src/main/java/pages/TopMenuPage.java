package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenuPage extends BasePage {

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".ui-autocomplete-input")
    private WebElement searchInputBox;

    public void inputSearchProductByText(String text) {
        sendKeys(searchInputBox, text);
    }

    @FindBy(css = "button .search")
    private WebElement searchBoxButton;

    public void triggerSearchProduct() {
        searchBoxButton.click();
    }

    @FindBy(css = "ul.ui-autocomplete")
    private WebElement dropdownList;

    public void waitForDropdownToLoad() {
        waitToBeVisible(dropdownList);
    }

    @FindBy(css = "span.product")
    private List<WebElement> searchedProductDropdown;


    //https://stackoverflow.com/questions/47310127/assert-that-element-from-listwebelement-contains-some-text
    public boolean isDropdownContainingText(String text) {
        return searchedProductDropdown.stream().anyMatch(e -> e.getText().trim().contains(text));

    }

    @FindBy(xpath = "//a[@data-depth=0]")
    private List<WebElement> topMenuCategories;

    public int getSizeOfMenuCategories() {
        return topMenuCategories.size();
    }

    public WebElement getMainCategory(int i) {
        return topMenuCategories.get(i);
    }


    @FindBy(id = "category-9")
    public WebElement artCategory;

    public void clickInArtCategory(){
        artCategory.click();
    }




}
