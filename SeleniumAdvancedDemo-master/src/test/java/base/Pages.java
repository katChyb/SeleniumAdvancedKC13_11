package base;


import org.junit.jupiter.api.BeforeEach;
import pages.TopMenuPage;
import pages.User.MyAccountPage;
import pages.User.RegistrationPage;
import pages.User.SignInPage;
import pages.product.FilterPage;
import pages.product.ProductDetailsPage;
import pages.product.ProductGridPage;
import pages.product.SearchProductResultPage;

public class Pages extends BaseTest {

public ProductDetailsPage productDetailsPage;
public ProductGridPage productGridPage;
public TopMenuPage topMenuPage;
public RegistrationPage registrationPage;
public SignInPage signInPage;
public MyAccountPage myAccountPage;

public SearchProductResultPage searchProductResultPage;

public FilterPage filterPage;


    @BeforeEach
    public  void setupPages() {
        productDetailsPage = new ProductDetailsPage(driver);
        productGridPage = new ProductGridPage(driver);
        topMenuPage = new TopMenuPage(driver);
        registrationPage = new RegistrationPage(driver);
        signInPage = new SignInPage(driver);
        myAccountPage = new MyAccountPage(driver);
        searchProductResultPage = new SearchProductResultPage(driver);
        filterPage = new FilterPage(driver);
    }
}
