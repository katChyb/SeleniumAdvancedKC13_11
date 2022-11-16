package product_categories;

import base.Pages;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.TopMenuPage;
import search.SearchTests;

import java.util.Locale;

public class ProductAndCategories extends Pages {

    private static Logger log = LoggerFactory.getLogger(ProductAndCategories.class);
    SoftAssertions softly = new SoftAssertions();

    @Test
    @RepeatedTest(10)
    @DisplayName("Categories Test")
    public void categoriesTest() {
        topMenuPage.getSizeOfMenuCategories();
        System.out.println("number of main categories: " + topMenuPage.getSizeOfMenuCategories());
        for (int i = 0; i < topMenuPage.getSizeOfMenuCategories(); i++) {
            log.info(topMenuPage.getMainCategory(i).getText());
            topMenuPage.getMainCategory(i).click();
            softly.assertThat(topMenuPage.getMainCategory(i).getText()).isEqualTo(driver.getTitle().toUpperCase(Locale.ROOT));
            softly.assertThat(productGridPage.getNumberProductsFromGrid()).isEqualTo(productGridPage.getNumberOfFoundProductsLabel());
            log.info("number products from grid: "+ productGridPage.getNumberProductsFromGrid());
            log.info("number products from label: " + productGridPage.getNumberOfFoundProductsLabel());
        }
        softly.assertAll();
    }



}
