package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

public class GoogleStepDefinitions {

    String currentUrl;
    String title;
    @Given("Kullanici Google Ana Sayfasina Gider")
    public void kullaniciGoogleAnaSayfasinaGider() {
        Driver.getDriver().get("https://google.com");
    }

    @And("Kullanici sayfanin urlini alir")
    public void kullaniciSayfaninUrliniAlir() {
        currentUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("Mevcut URl'imiz: " + currentUrl);
    }

    @Then("Kullanici sayfanin urlinin google icerdigini dogrular")
    public void kullaniciSayfaninUrlininGoogleIcerdiginiDogrular() {
        Assert.assertTrue(currentUrl.contains("google"));
        Assert.fail();
    }

    @And("Kullanici sayfanin titleini alir")
    public void kullaniciSayfaninTitleiniAlir() {
        title = Driver.getDriver().getTitle();
        System.out.println("Mevcut Title'imiz: " + title);
    }

    @Then("Kullanici sayfanin titleinin google icerdigini dogrular")
    public void kullaniciSayfaninTitleininGoogleIcerdiginiDogrular() {
        Assert.assertEquals("Google", title);
        Assert.fail();
    }

    @And("Driver kapatilir")
    public void driverKapatilir() {
        Driver.closeDriver();
    }
}
