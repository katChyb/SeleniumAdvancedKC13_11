package Filters;

import base.Pages;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class FiltersTest extends Pages {

    @Test
    @RepeatedTest(5)
    public void filtersTest() throws InterruptedException {
        topMenuPage.clickInArtCategory();
        filterPage.moveSlider();

    }
}
