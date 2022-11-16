package pages.product;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(css = ".ui-slider-horizontal")
    public WebElement priceSliderArt;

    @FindBy(css ="a.ui-slider-handle:nth-child(2)")
    public WebElement leftSlider;

    @FindBy(css ="a.ui-slider-handle:nth-child(3)")
    public WebElement rightSlider;



//https://huddle.eurostarsoftwaretesting.com/selenium-interact-sliders-selenium/


    public void moveSlider() throws InterruptedException {

        waitToBeVisible(priceSliderArt);

        Dimension sliderSize = priceSliderArt.getSize();
        int sliderWidth = sliderSize.getWidth();
        int xCoord = priceSliderArt.getLocation().getX();

        System.out.println("sliderWidth" + sliderWidth);
        System.out.println("xCoord" +xCoord);

        Actions builder = new Actions(driver);
        builder.moveToElement(priceSliderArt)
                .click()
                .dragAndDropBy(leftSlider, xCoord + sliderWidth, 0)
                .build()
                .perform();

        Thread.sleep(5000);

    }

}
