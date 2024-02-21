import com.base.BaseTest;
import com.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    private HomePage homePage;

    @BeforeMethod
    public void initHomeTest() {
        blHolder.getBaseBL().loadSite();
        homePage = blHolder.getHomeBL().getHomePage();
    }

    @Test(priority = 1, description = "Verify sign in with valid credentials")
    public void SignInWithValidCredential(){
        homePage.clickSignIn();
    }
}
