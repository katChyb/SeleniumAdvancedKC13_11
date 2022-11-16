package Filters;

import base.Pages;
import org.junit.jupiter.api.Test;

public class FiltersTest extends Pages {

    @Test
    public void filtersTest() throws InterruptedException {
        topMenuPage.clickInArtCategory();
        productGridPage.moveSlider();

    }
}
