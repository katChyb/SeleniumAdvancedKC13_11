package pages.product;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.Random;

public class ProductGridPage extends BasePage {
    public ProductGridPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".product-title")
    private List<WebElement> productGrid;

    public String getRandomProductNameFromGrid() {
        int gridListSize = productGrid.size();
        return productGrid.get(new Random().nextInt(gridListSize)).getText();

    }

    public String getNumberProductsFromGrid() {
        return "There are " + String.valueOf(productGrid.size()) + " products.";
    }


    @FindBy(css = ".total-products")
    private WebElement numberOfProductsFoundLabel;

    public String getNumberOfFoundProductsLabel() {
        return numberOfProductsFoundLabel.getText();
    }



}
