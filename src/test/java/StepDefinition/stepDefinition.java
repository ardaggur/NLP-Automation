package StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class stepDefinition {

    public WebDriver driver;

    public stepDefinition()
    {
        System.setProperty("webdriver.chrome.driver","/Users/ardagur/Desktop/chromedriver_mac64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Open \"([^\"]*)\"$")
    public void open_something(String url) throws Throwable {

        driver.get(url);

    }

    @When("^Login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_something_and_something(String username, String password) throws Throwable {

        WebElement girisYapButton = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        girisYapButton.click();

        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.click();
        emailField.sendKeys(username);
        WebElement devamEtButton = driver.findElement(By.id("continue"));
        devamEtButton.click();

        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.click();
        passwordField.sendKeys(password);
        WebElement girisYap = driver.findElement(By.id("signInSubmit"));
        girisYap.click();

    }

    @Then("^Login$")
    public void login() throws Throwable {
        System.out.println("calisti");
    }

    @When("^Search \"([^\"]*)\"$")
    public void search_something(String product) throws Throwable {

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        searchBox.sendKeys(product);

        WebElement searchSubmitButton = driver.findElement(By.id("nav-search-submit-button"));
        searchSubmitButton.click();

    }

    @Then("^Search$")
    public void search() throws Throwable {
        //System.out.println("Search");
    }


    @When("^View cart$")
    public void view_cart() throws Throwable {

        WebElement viewCart = driver.findElement(By.id("nav-cart-count"));
        viewCart.click();

    }

    @Then("^View")
    public void view() throws Throwable {
        System.out.println("View");
    }

    @When("^View orders$")
    public void view_orders() throws Throwable {
        WebElement orders = driver.findElement(By.id("nav-orders"));
        orders.click();
    }

    @When("^View account")
    public void view_account() throws Throwable {

        WebElement accountButton = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        accountButton.click();

    }

    @Then("^Go")
    public void go() throws Throwable {
        //System.out.println("Go");
    }

    @When("^Add \"([^\"]*)\" to cart$")
    public void add_something_to_cart(String product) throws Throwable {

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        searchBox.sendKeys(product);

        WebElement searchSubmitButton = driver.findElement(By.id("nav-search-submit-button"));
        searchSubmitButton.click();

        WebElement urun = driver.findElement(By.xpath("//div/img[@class=\"s-image\"][@data-image-index=\"1\"]"));
        urun.click();

        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();

    }

    @When("^Complete the transaction")
    public void complete_the_transaction() throws Throwable {

        WebElement alisverisiTamamla = driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]"));
        alisverisiTamamla.click();

    }

    @When("^Close cookies")
    public void close_cookies() throws Throwable {

        WebElement close_cookies = driver.findElement(By.id("sp-cc-rejectall-link"));
        close_cookies.click();

    }

    @When("^Show cok satanlar")
    public void show_cok_satanlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        WebElement cok_satanlar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[1]"));
        cok_satanlar.click();


    }

    @When("^Show yeni cikanlar")
    public void yeni_cikanlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        WebElement yeni_cikanlar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[2]"));
        yeni_cikanlar.click();

    }

    @When("^Show en iyi performans gosterenler")
    public void en_iyi_performans_gosterenler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        WebElement en_iyi_performans_gosterenler = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[3]"));
        en_iyi_performans_gosterenler.click();

    }

    @When("^Category ayakkabi")
    public void ayakkabi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        WebElement ayakkabi = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[4]"));
        ayakkabi.click();

    }

    @When("^Category bahce")
    public void bahce() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        WebElement bahce = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
        bahce.click();

    }

    @When("^Category bebek")
    public void bebek() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

    }

    @When("^Category bilgisayar")
    public void bilgisayar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

    }

    @When("^Category elektronik")
    public void elektronik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

    }

    @When("^Category ev ve yasam")
    public void ev_ve_yasam() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);


        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

    }

    @When("^Category evcil hayvan")
    public void evcil_hayvan() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);


        WebElement evcil_hayvan = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[10]"));
        evcil_hayvan.click();

    }

    @When("^Category gida urunleri")
    public void gida_urunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);


        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

    }

    @When("^Category kisisel bakim ve kozmetik")
    public void kisisel_bakim_ve_kozmetik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

    }

    @When("^Category kitap")
    public void kitap() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

    }

    @When("^Category kadin moda")
    public void kadin_moda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

    }

    @When("^Category erkek moda")
    public void erkek_moda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

    }

    @When("^Category cocuk ve bebek moda")
    public void cocuk_ve_bebek_moda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement cocuk_ve_bebek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[16]"));
        cocuk_ve_bebek_moda.click();

    }

    @When("^Category mutfak")
    public void mutfak() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari")
    public void muzik_ekipmanlari_ve_enstrumanlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

    }

    @When("^Category ofis ve kirtasiye")
    public void ofis_ve_kirtasiye() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

    }

    @When("^Category otomotiv")
    public void otomotiv() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

    }

    @When("^Category oyuncak")
    public void oyuncak() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

    }

    @When("^Category saglik, bakim, temizlik")
    public void saglik_bakim_temizlik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement saglik_bakim_temizlik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[22]"));
        saglik_bakim_temizlik.click();

    }

    @When("^Category spor ve outdoor")
    public void spor_ve_outdoor() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

    }

    @When("^Category telefon")
    public void telefon() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri")
    public void televizyonlar_ve_ev_sinema_sistemleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

    }

    @When("^Category video oyunu ve konsol")
    public void video_oyunu_ve_konsol() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

    }

    @When("^Category yapi market")
    public void yapi_market() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

    }

    @When("^Category outlet reyonu")
    public void outlet_reyonu() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement outlet_reyonu = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[28]"));
        outlet_reyonu.click();

    }

    //---------------------------------------------------------------------

    @When("^Category bahce Subcategory aydinlatma")
    public void bahce_aydinlatma() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement bahce = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
        bahce.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Aydınlatma"));
        button.click();

    }

    @When("^Category bahce Subcategory bahce aletleri ve sulama ekipmanlari")
    public void bahce_aletleri_ve_sulama_ekipmanlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement bahce = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
        bahce.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bahçe Aletleri ve Sulama Ekipmanları"));
        button.click();

    }

    @When("^Category bahce Subcategory cim biciciler ve elektrikli bahce aletleri")
    public void cim_biciciler_ve_elektrikli_bahce_aletleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement bahce = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
        bahce.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çim Biçiciler ve Elektrikli Bahçe Aletleri"));
        button.click();

    }

    @When("^Category bahce Subcategory barbeku ve yemek pisirme urunleri")
    public void barbeku_ve_yemek_pisirme_urunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement bahce = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
        bahce.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Barbekü ve Yemek Pişirme Ürünleri"));
        button.click();

    }

    @When("^Category bahce Subcategory bitkiler, tohumlar ve soganlar")
    public void bitkiler_tohumlar_ve_soganlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement bahce = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
        bahce.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bitkiler, Tohumlar ve Soğanlar"));
        button.click();

    }

    @When("^Category bahce Subcategory cim ve bitki bakimi")
    public void cim_ve_bitki_bakimi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement bahce = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
        bahce.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çim ve Bitki Bakımı"));
        button.click();

    }

    @When("^Category bahce Subcategory havuzlar, jakuziler ve malzemeleri")
    public void havuzlar_jakuziler_ve_malzemeleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement bahce = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
        bahce.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Havuzlar, Jakuziler ve Malzemeleri"));
        button.click();

    }

    @When("^Category bahce Subcategory termometler ve meteroloji araclari")
    public void termometler_ve_meteroloj_araclari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement bahce = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
        bahce.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Termometler ve Meteroloji Araçları"));
        button.click();

    }

    @When("^Category bahce Subcategory tum bahce urunleri")
    public void tum_bahce_urunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement bahce = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[5]"));
        bahce.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Bahçe Ürünleri"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category bebek Subcategory alt degistirme")
    public void alt_degistirme() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Alt Değiştirme"));
        button.click();

    }

    @When("^Category bebek Subcategory bebek bezleri")
    public void bebek_bezleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bebek Bezleri"));
        button.click();

    }

    @When("^Category bebek Subcategory mendiller ve aksesuarlar")
    public void mendiller_ve_aksesuarlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Mendiller ve Aksesuarlar"));
        button.click();

    }

    @When("^Category bebek Subcategory bebek gidalari")
    public void bebek_gidalari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bebek Gıdaları"));
        button.click();

    }

    @When("^Category bebek Subcategory emzirme ve besleme urunleri gidalari")
    public void emzirme_ve_besleme_urunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Emzirme ve Besleme Ürünleri"));
        button.click();

    }

    @When("^Category bebek Subcategory biberonlar ve aksesuarlari")
    public void biberonlar_ve_aksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Biberonlar ve Aksesuarları"));
        button.click();

    }

    @When("^Category bebek Subcategory mama sandalyeleri")
    public void mama_sandalyeleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Mama Sandalyeleri"));
        button.click();

    }

    @When("^Category bebek Subcategory puset, bebek arabasi ve aksesuarlari")
    public void puset_bebekarabasi_ve_aksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Puset, Bebek Arabası ve Aksesuarları"));
        button.click();

    }

    @When("^Category bebek Subcategory oto koltuklari")
    public void oto_koltuklari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Oto Koltukları"));
        button.click();

    }

    @When("^Category bebek Subcategory bebek telsizleri")
    public void bebek_telsizleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bebek Telsizleri"));
        button.click();

    }

    @When("^Category bebek Subcategory bebek odasi")
    public void bebek_odasi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bebek Odası"));
        button.click();

    }

    @When("^Category bebek Subcategory bebek giyim")
    public void bebek_giyim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bebek Giyim"));
        button.click();

    }

    @When("^Category bebek Subcategory aktivite ve eglence")
    public void aktivite_ve_eglence() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Aktivite ve Eğlence"));
        button.click();

    }

    @When("^Category bebek Subcategory oyun halilari ve matlari")
    public void oyun_halilai_ve_matlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Oyun Halıları ve Matları"));
        button.click();

    }

    @When("^Category bebek Subcategory guvenlik ekipmanlari")
    public void guvenlik_ekipmanlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Güvenlik Ekipmanları"));
        button.click();

    }

    @When("^Category bebek Subcategory emzikler ve dis kasiyicilar")
    public void emzikler_ve_dis_kasiyicilar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Emzikler ve Diş Kaşıyıcılar"));
        button.click();

    }

    @When("^Category bebek Subcategory tuvalet egitimi ve basamaklar")
    public void tuvalet_egitimi_ve_basamaklar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Tuvalet Eğitimi ve Basamaklar"));
        button.click();

    }

    @When("^Category bebek Subcategory tum bebek urunleri")
    public void tum_bebek_urunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bebek = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[6]"));
        bebek.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Tüm Bebek Ürünleri"));
        button.click();

    }


    //---------------------------------------------------------------------

    @When("^Category bilgisayar Subcategory dizustu bilgisayarlar")
    public void dizustu_bilgisayar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Dizüstü Bilgisayarlar"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory masaustu bilgisayarlar")
    public void masaustu_bilgisayar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Masaüstü Bilgisayarlar"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory tabletler")
    public void tabletler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tabletler"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory monitorler")
    public void monitorler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Monitorler"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory oyun bilgisayarlari")
    public void oyun_bilgisayarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Oyun Bilgisayarları"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory video oyunu ve konsol")
    public void video_oyunu_ve_konsol2() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Video Oyunu ve Konsol"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory ekran kartlari")
    public void ekran_kartlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ekran Kartları"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory bellekler")
    public void bellekler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bellekler"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory bilgisayar kasalari")
    public void bilgisayar_kasalari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bilgisayar Kasaları"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory anakartlar")
    public void anakartlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Anakartlar"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory islemciler")
    public void islemciler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("İşlemciler"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory bilgisayar bilesenleri")
    public void bilgisayar_bilesenleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Bilgisayar Bileşenleri"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory klavyeler")
    public void klavyeler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Klavyeler"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory mouselar")
    public void mouselar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Mouse'lar"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory sırt cantalari")
    public void sırt_cantalari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Sırt Çantaları"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory koruyucu kiliflar")
    public void koruyucu_kiliflar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Koruyucu Kılıflar"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory bilgisayar kulakliklari")
    public void bilgisayar_kulakliklari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Bilgisayar Kulaklıkları"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory bilgisayar aksesuarlari")
    public void bilgisayar_aksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Bilgisayar Aksesuarları"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory usb bellekler")
    public void usb_bellekler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("USB Bellekler"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory dahili ssd'ler")
    public void dahili_ssdler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Dahili SSD'ler"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory harici veri depolama cihazlari")
    public void harici_veri_depolama_cihazlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Harici Veri Depolama Cihazları"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory dahili sabit suruculer")
    public void dahili_sabit_suruculer() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Dahili Sabit Sürücüler"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory veri depolama")
    public void veri_depolama() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Veri Depolama"));
        button.click();

    }

    @When("^Category bilgisayar Subcategory tum bilgisayar urunleri")
    public void tum_bilgisayar_urunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement bilgisayar = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[7]"));
        bilgisayar.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Tüm Bilgisayar Ürünleri"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category elektronik Subcategory bilgisayar")
    public void elektronik_bilgisayar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Bilgisayar"));
        button.click();

    }

    @When("^Category elektronik Subcategory cep telefonlari ve aksesuarlar")
    public void elektronik_cep_telefonlari_ve_aksesuarlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Cep Telefonları ve Aksesuarlar"));
        button.click();

    }

    @When("^Category elektronik Subcategory televizyonlar ve ev sinema sistemleri")
    public void elektronik_televizyonlar_ve_ev_sinema_sistemleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Televizyonlar ve Ev Sinema Sistemleri"));
        button.click();

    }

    @When("^Category elektronik Subcategory tabletler")
    public void elektronik_tabletler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Tabletler"));
        button.click();

    }

    @When("^Category elektronik Subcategory kulakliklar")
    public void elektronik_kulakliklar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Kulaklıklar"));
        button.click();

    }

    @When("^Category elektronik Subcategory ses sistemleri ve hoparlorler")
    public void elektronik_ses_sistemleri_ve_hoparlorler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Ses Sistemleri ve Hoparlörler"));
        button.click();

    }

    @When("^Category elektronik Subcategory akilli saatler")
    public void elektronik_akilli_saatler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Akıllı Saatler"));
        button.click();

    }

    @When("^Category elektronik Subcategory kameralar ve fotograf makineleri")
    public void elektronik_kameralar_ve_fotograf_makineleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Kameralar ve Fotoğraf Makineleri"));
        button.click();

    }

    @When("^Category elektronik Subcategory tasinabilir hoparlorler")
    public void elektronik_tasinabilirhoparlorler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Taşınabilir Hoparlörler"));
        button.click();

    }

    @When("^Category elektronik Subcategory elektrikli ev ve mutfak aletleri")
    public void elektronik_elektriklievvemutfakaletleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Elektrikli Ev ve Mutfak Aletleri"));
        button.click();

    }

    @When("^Category elektronik Subcategory oto ve arac elektronigi")
    public void elektronik_otovearacelektronigi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Oto ve Araç Elektroniği"));
        button.click();

    }

    @When("^Category elektronik Subcategory piller ve pil sarj aletleri")
    public void elektronik_pillervepilsarjaletleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Piller ve Pil Şarj Aletleri"));
        button.click();

    }

    @When("^Category elektronik Subcategory telefonlar, voip ve aksesuarlari")
    public void elektronik_telefonlar_viop_ve_aksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Telefonlar, VOIP ve Aksesuarları"));
        button.click();

    }

    @When("^Category elektronik Subcategory tum elektronik urunler")
    public void elektronik_tum_elektronik_urunler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement elektronik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[8]"));
        elektronik.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Tüm Elektronik Ürünler"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category ev ve yasam Subcategory ev dekorasyonu")
    public void ev_ve_yasam_evdekorasyonu() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("Ev Dekorasyonu"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory ev tekstili ve uyku setleri")
    public void ev_ve_yasam_evtekstiliveuykusetleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("Ev Tekstili ve Uyku Setleri"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory elektrikli süpürgeler")
    public void ev_ve_yasam_elektrikli_süpürgeler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("ELektrikli Süpürgeler"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory utuler")
    public void ev_ve_yasam_utuler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("Ütüler"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory tablolar")
    public void ev_ve_yasam_tablolar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("Tablolar"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory aydinlatma")
    public void ev_ve_yasam_aydinlatma() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("Aydınlatma"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory LED ampuller")
    public void ev_ve_yasam_ledampuller() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("LED Ampuller"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory nevresimler")
    public void ev_ve_yasam_nevresimler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("Nevresimler"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory depo ve ev duzenleme")
    public void ev_ve_yasam_depoveevduzenleme() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("Depo ve Ev Düzenleme"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory banyo")
    public void ev_ve_yasam_banyo() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("Banyo"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory calisma masasi sandalyeleri")
    public void ev_ve_yasam_calismamasasisandalyeleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("Çalışma Masası Sandalyeleri"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory mobilyalar")
    public void ev_ve_yasam_mobilyalar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);


        WebElement button = driver.findElement(By.linkText("Mobilyalar"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory temizlik aletleri")
    public void ev_ve_yasam_temizlikaletleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Temizlik Aletleri"));
        button.click();

    }

    @When("^Category ev ve yasam Subcategory tum ev ve yasam urunleri")
    public void ev_ve_yasam_tum_ev_ve_yasam_urunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);


        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement ev_ve_yasam = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[9]"));
        ev_ve_yasam.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Tüm Ev ve Yaşam Ürünleri"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category evcil hayvan Subcategory kediler")
    public void evcil_hayvan_kediler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement evcil_hayvan = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[10]"));
        evcil_hayvan.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kediler"));
        button.click();

    }

    @When("^Category evcil hayvan Subcategory kopekler")
    public void evcil_hayvan_kopekler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement evcil_hayvan = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[10]"));
        evcil_hayvan.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Köpekler"));
        button.click();

    }

    @When("^Category evcil hayvan Subcategory baliklar")
    public void evcil_hayvan_baliklar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement evcil_hayvan = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[10]"));
        evcil_hayvan.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Balıklar"));
        button.click();

    }

    @When("^Category evcil hayvan Subcategory kuslar")
    public void evcil_hayvan_kuslar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement evcil_hayvan = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[10]"));
        evcil_hayvan.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kuşlar"));
        button.click();

    }

    @When("^Category evcil hayvan Subcategory kemirgenler ve kucuk hayvanlar")
    public void evcil_hayvan_kemirgenlervekucukhayvanlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement evcil_hayvan = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[10]"));
        evcil_hayvan.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kemirgenler ve Küçük Hayvanlar"));
        button.click();

    }

    @When("^Category evcil hayvan Subcategory tum evcil hayvan urunleri")
    public void evcil_hayvan_tum() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement evcil_hayvan = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[10]"));
        evcil_hayvan.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Evcil Hayvan Ürünleri"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category gida urunleri Subcategory icecekler, cay ve kahveler")
    public void gida_urunleri_iceceklercayvekahveler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("İçecekler, Çay ve Kahveler"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory tatli ve tuzlu atistirmaliklar")
    public void gida_urunleri_tatlivetuzluatistirmaliklar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tatlı ve Tuzlu Atıştırmalıklar"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory kahvaltilik gevrekler ve musliler")
    public void gida_urunleri_kahvaltilikgevreklervemusliler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kahvaltılık Gevrekler ve Müsliler"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory baklagiller ve makarnalar")
    public void gida_urunleri_baklagillervemakarnalar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Baklagiller ve Makarnalar"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory konserve ve kavanozda yiyecekler")
    public void gida_urunleri_konservevekavanozdayiyecekler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Konserve ve Kavanozda Yiyecekler"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory soslar ve salçalar")
    public void gida_urunleri_soslarvesalcalar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Soslar ve Salçalar"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory yaglar, sirkeler ve salata soslari")
    public void gida_urunleri_yaglarsirkelervesalatasoslari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Yağlar, Sirkeler ve Salata Sosları"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory kuru meyve ve kuruyemisler")
    public void gida_urunleri_kurumeyvevekuruyemisler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kuru Meyve ve Kuruyemişler"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory cesni ve baharatlar")
    public void gida_urunleri_cesnivebaharatlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çeşni ve Baharatlar"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory receller, ballar ve ezmeler")
    public void gida_urunleri_recellerballarveezmeler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Reçeller, Ballar ve Ezmeler"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory pastacilik ve pisirme malzemeleri")
    public void gida_urunleri_pastacilikvepisirmemalzemeleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Pastacılık ve Pişirme Malzemeleri"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory bebek gidalari")
    public void gida_urunleri_bebekgidalari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bebek Gıdaları"));
        button.click();

    }

    @When("^Category gida urunleri Subcategory tum gida urunleri")
    public void gida_urunleri_tumgidaurunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        WebElement gida_urunleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[11]"));
        gida_urunleri.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        WebElement button = driver.findElement(By.linkText("Tüm Gıda Ürünleri"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category kisisel bakim ve kozmetik Subcategory makyaj")
    public void kisisel_bakim_ve_kozmetik_makyaj() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Makyaj"));
        button.click();

    }

    @When("^Category kisisel bakim ve kozmetik Subcategory cilt bakimi")
    public void kisisel_bakim_ve_kozmetik_cilt_bakimi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Cilt Bakımı"));
        button.click();

    }

    @When("^Category kisisel bakim ve kozmetik Subcategory sac bakimi")
    public void kisisel_bakim_ve_kozmetik_sacbakimi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Saç Bakımı"));
        button.click();

    }

    @When("^Category kisisel bakim ve kozmetik Subcategory dis bakimi")
    public void kisisel_bakim_ve_kozmetik_disbakimi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Diş Bakımı"));
        button.click();

    }

    @When("^Category kisisel bakim ve kozmetik Subcategory vucut bakimi ve banya urunleri")
    public void kisisel_bakim_ve_kozmetik_vucutbakimivebanyourunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Vücut Bakımı ve Banyo Ürünleri"));
        button.click();

    }

    @When("^Category kisisel bakim ve kozmetik Subcategory tiras, epilasyon, agda")
    public void kisisel_bakim_ve_kozmetik_tirasepilasyonagda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tıraş, Epilasyon, Ağda"));
        button.click();

    }

    @When("^Category kisisel bakim ve kozmetik Subcategory pedler ve hijyen urunleri")
    public void kisisel_bakim_ve_kozmetik_pedlervehijyenurunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Pedler ve Hijyen Ürünleri"));
        button.click();

    }

    @When("^Category kisisel bakim ve kozmetik Subcategory makyaj fircalari ve aksesuarlari")
    public void kisisel_bakim_ve_kozmetik_makyajfircalariveaksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Makyaj Fırçaları ve Aksesuarları"));
        button.click();

    }

    @When("^Category kisisel bakim ve kozmetik Subcategory premium kisisel bakim ve kozmetik")
    public void kisisel_bakim_ve_kozmetik_premiumkisiselbakimvekozmetik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Premium Kişisel Bakım ve Kozmetik"));
        button.click();

    }

    @When("^Category kisisel bakim ve kozmetik Subcategory tum kisisel bakim ve kozmetik urunleri")
    public void kisisel_bakim_ve_kozmetik_tum() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kisisel_bakim_ve_kozmetik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[12]"));
        kisisel_bakim_ve_kozmetik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Kişisel Bakım ve Kozmetik Ürünleri"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category kitap Subcategory edebiyat ve kurgu")
    public void kitap_edebiyatvekurgu() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Edebiyat ve Kurgu"));
        button.click();


    }

    @When("^Category kitap Subcategory yabanci dilde kitaplar")
    public void kitap_yabancidildekitaplar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Yabancı Dilde Kitaplar"));
        button.click();


    }

    @When("^Category kitap Subcategory cocuk kitaplari")
    public void kitap_cocukkitaplari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çocuk Kitapları"));
        button.click();

    }

    @When("^Category kitap Subcategory siyaset ve felsefe")
    public void kitap_siyasetvefelsefe() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Siyaset ve Felsefe"));
        button.click();

    }

    @When("^Category kitap Subcategory tarih")
    public void kitap_tarih() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tarih"));
        button.click();

    }

    @When("^Category kitap Subcategory ders kitaplari")
    public void kitap_derskitaplari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ders Kitapları"));
        button.click();

    }

    @When("^Category kitap Subcategory is ve ekonomi")
    public void kitap_isveekonomi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("İş ve Ekonomi"));
        button.click();

    }

    @When("^Category kitap Subcategory cizgi romanlar, manga ve grafik romanlar")
    public void kitap_cizgiromanlarmangavegrafikromanlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çizgi Romanlar, Manga ve Grafik Romanlar"));
        button.click();

    }

    @When("^Category kitap Subcategory bilgisayarlar ve internet")
    public void kitap_bilgisayarlarveinternet() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bilgisayarlar ve İnternet"));
        button.click();

    }

    @When("^Category kitap Subcategory bilim kurgu ve fantastik")
    public void kitap_bilimkurguvefantastik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bilim Kurgu ve Fantastik"));
        button.click();

    }

    @When("^Category kitap Subcategory din ve maneviyat")
    public void kitap_dinvemaneviyat() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Din ve Maneviyat"));
        button.click();

    }

    @When("^Category kitap Subcategory bilim, doga ve matematik")
    public void kitap_bilimdogavematematik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bilim, Doğa ve Matematik"));
        button.click();

    }

    @When("^Category kitap Subcategory biyografiler ve anilar")
    public void kitap_biyografilerveanilar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Biyografiler ve Anılar"));
        button.click();

    }

    @When("^Category kitap Subcategory yemek pisirme, yiyecekler ve sarap")
    public void kitap_yemekpisirmeyiyeceklervesarap() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Yemek Pişirme, Yiyecekler ve Şarap"));
        button.click();

    }

    @When("^Category kitap Subcategory muhendislik ve ulastirma")
    public void kitap_muhendislikveulastirma() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Mühendislik ve Ulaştırma"));
        button.click();

    }

    @When("^Category kitap Subcategory guzel sanatlar ve fotograf")
    public void kitap_guzelsanatlarvefotograf() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Güzel Sanatlar ve Fotoğraf"));
        button.click();

    }

    @When("^Category kitap Subcategory ev, bahce ve hobi")
    public void kitap_evbahcevehobi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ev, Bahçe ve Hobi"));
        button.click();

    }

    @When("^Category kitap Subcategory egitim arastirmalari ve ogretim kitaplari")
    public void kitap_egitimarastirmalari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Eğitim Araştırmaları ve Öğretim Kitapları"));
        button.click();

    }

    @When("^Category kitap Subcategory gizem, gerilim ve suphe")
    public void kitap_gizemgerilimvesuphe() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Gizem, Gerilim ve Şüphe"));
        button.click();

    }

    @When("^Category kitap Subcategory yabanci dil calismalari ve basvuru kaynaklari")
    public void kitap_yabancidilcalismalari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Yabancı Dil Çalışmaları ve Başvuru Kaynakları"));
        button.click();

    }

    @When("^Category kitap Subcategory saglik, fitness ve beslenme")
    public void kitap_saglikfitnessvebeslenme() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Sağlık, Fitness ve Beslenme"));
        button.click();

    }

    @When("^Category kitap Subcategory spor ve outdoor")
    public void kitap_sporveoutdoor() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Spor ve Outdoor"));
        button.click();

    }

    @When("^Category kitap Subcategory mizah ve eglence")
    public void kitap_mizahveeglence() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Mizah ve Eğlence"));
        button.click();

    }

    @When("^Category kitap Subcategory tum kitaplar")
    public void kitap_tumkitaplar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kitap = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[13]"));
        kitap.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Kitaplar"));
        button.click();

    }


    //---------------------------------------------------------------------


    @When("^Category kadin moda Subcategory ayakkabi")
    public void kadin_moda_ayakkabi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ayakkabı"));
        button.click();

    }

    @When("^Category kadin moda Subcategory kiyafet")
    public void kadin_moda_kiyafet() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kıyafet"));
        button.click();

    }

    @When("^Category kadin moda Subcategory el ve omuz cantasi")
    public void kadin_moda_elveomuzcantasi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("El ve Omuz Çantası"));
        button.click();

    }

    @When("^Category kadin moda Subcategory aksesuarlar")
    public void kadin_moda_aksesuarlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Aksesuarlar"));
        button.click();

    }

    @When("^Category kadin moda Subcategory elbise")
    public void kadin_moda_elbise() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Elbise"));
        button.click();

    }

    @When("^Category kadin moda Subcategory ic camasiri ve ic giyim")
    public void kadin_moda_iccamasiriveicgiyim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("İç Çamaşırı ve İç Giyim"));
        button.click();

    }

    @When("^Category kadin moda Subcategory dis giyim")
    public void kadin_moda_disgiyim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Dış Giyim"));
        button.click();

    }

    @When("^Category kadin moda Subcategory spor giyim")
    public void kadin_moda_sporgiyim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Spor Giyim"));
        button.click();

    }

    @When("^Category kadin moda Subcategory jean")
    public void kadin_moda_jean() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Jean"));
        button.click();

    }

    @When("^Category kadin moda Subcategory pantolon")
    public void kadin_moda_pantolon() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Pantolon"));
        button.click();

    }

    @When("^Category kadin moda Subcategory etek")
    public void kadin_moda_etek() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Etek"));
        button.click();

    }

    @When("^Category kadin moda Subcategory bluz ve gomlek")
    public void kadin_moda_bluzvegomlek() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bluz ve Gömlek"));
        button.click();

    }

    @When("^Category kadin moda Subcategory ust ve t-shirt")
    public void kadin_moda_ustvetshirt() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Üst ve T-shirt"));
        button.click();

    }

    @When("^Category kadin moda Subcategory triko")
    public void kadin_moda_triko() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Triko"));
        button.click();

    }

    @When("^Category kadin moda Subcategory kapusonlu ve kapusonsuz sweatshirt")
    public void kadin_moda_kapusonluvekapusonsuzsweatshirt() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kapüşonlu ve Kapüşonsuz Sweatshirt"));
        button.click();

    }

    @When("^Category kadin moda Subcategory plaj giyim")
    public void kadin_moda_plajgiyim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Plaj Giyim"));
        button.click();

    }

    @When("^Category kadin moda Subcategory pijama takimi")
    public void kadin_moda_pijamatakimi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Pijama Takımı"));
        button.click();

    }

    @When("^Category kadin moda Subcategory corap ve kulotlu corap")
    public void kadin_moda_corapvekulotlucorap() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çorap ve Külotlu Çorap"));
        button.click();

    }

    @When("^Category kadin moda Subcategory taki")
    public void kadin_moda_taki() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Takı"));
        button.click();

    }

    @When("^Category kadin moda Subcategory saat")
    public void kadin_moda_saat() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Saat"));
        button.click();

    }

    @When("^Category kadin moda Subcategory bavul ve seyahat cantasi")
    public void kadin_moda_bavulveseyahatcantasi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bavul ve Seyahat Çantası"));
        button.click();

    }

    @When("^Category kadin moda Subcategory kadin moda")
    public void kadin_moda_kadinmoda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kadın Moda"));
        button.click();

    }

    @When("^Category kadin moda Subcategory erkek moda")
    public void kadin_moda_erkekmoda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Erkek Moda"));
        button.click();

    }

    @When("^Category kadin moda Subcategory cocuk ve bebek moda")
    public void kadin_moda_cocukvebebekmoda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çocuk ve Bebek Moda"));
        button.click();

    }

    @When("^Category kadin moda Subcategory tum moda urunleri")
    public void kadin_moda_tummodaurunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Moda Ürünleri"));
        button.click();

    }

    @When("^Category kadin moda Subcategory indirim")
    public void kadin_moda_indirim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement kadin_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[14]"));
        kadin_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("İndirim"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category erkek moda Subcategory ayakkabi")
    public void erkek_moda_ayakkabi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ayakkabı"));
        button.click();

    }

    @When("^Category erkek moda Subcategory kiyafet")
    public void erkek_moda_kiyafet() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kıyafet"));
        button.click();

    }

    @When("^Category erkek moda Subcategory el ve omuz cantasi")
    public void elveomuzcantasi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("El ve Omuz Çantası"));
        button.click();

    }

    @When("^Category erkek moda Subcategory aksesuarlar")
    public void erkek_moda_aksesuarlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Aksesuarlar"));
        button.click();

    }

    @When("^Category erkek moda Subcategory spor giyim")
    public void erkek_moda_sporgiyim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Spor Giyim"));
        button.click();

    }

    @When("^Category erkek moda Subcategory jean")
    public void erkek_moda_jean() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Jean"));
        button.click();

    }

    @When("^Category erkek moda Subcategory pantolon")
    public void erkek_moda_pantolon() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Pantolon"));
        button.click();

    }

    @When("^Category erkek moda Subcategory sort")
    public void erkek_moda_sort() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Şort"));
        button.click();

    }

    @When("^Category erkek moda Subcategory t-shirt")
    public void erkek_moda_tshirt() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("T-shirt"));
        button.click();

    }

    @When("^Category erkek moda Subcategory gomlek")
    public void erkek_moda_gomlek() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Gömlek"));
        button.click();

    }

    @When("^Category erkek moda Subcategory kapusonlu ve kapusonsuz sweatshirt")
    public void erkek_moda_kapusonlu() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kapüşonlu ve Kapüşonsuz Sweatshirt"));
        button.click();

    }

    @When("^Category erkek moda Subcategory triko")
    public void erkek_moda_triko() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Triko"));
        button.click();

    }

    @When("^Category erkek moda Subcategory dis giyim")
    public void erkek_moda_disgiyim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Dış Giyim"));
        button.click();

    }

    @When("^Category erkek moda Subcategory ic camasiri ve ic giyim")
    public void erkek_moda_iccamasiri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("İç Çamaşırı ve İç Giyim"));
        button.click();

    }

    @When("^Category erkek moda Subcategory corap")
    public void erkek_moda_corap() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çorap"));
        button.click();

    }

    @When("^Category erkek moda Subcategory ev giyimi")
    public void erkek_moda_evgiyimi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ev Giyimi"));
        button.click();

    }

    @When("^Category erkek moda Subcategory plaj giyim")
    public void erkek_moda_plajgiyim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Plaj Giyim"));
        button.click();

    }

    @When("^Category erkek moda Subcategory takim elbise")
    public void erkek_moda_takimelbise() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Takım Elbise"));
        button.click();

    }

    @When("^Category erkek moda Subcategory taki")
    public void erkek_moda_taki() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Takı"));
        button.click();

    }

    @When("^Category erkek moda Subcategory saat")
    public void erkek_moda_saat() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Saat"));
        button.click();

    }

    @When("^Category erkek moda Subcategory bavul ve seyahat cantasi")
    public void erkek_moda_bavulveseyahatcantasi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bavul ve Seyahat Çantası"));
        button.click();

    }

    @When("^Category erkek moda Subcategory erkek moda")
    public void erkek_moda_erkekmoda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Erkek Moda"));
        button.click();

    }

    @When("^Category erkek moda Subcategory kadin moda")
    public void erkek_moda_kadinmoda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kadın Moda"));
        button.click();

    }

    @When("^Category erkek moda Subcategory cocuk ve bebek moda")
    public void erkek_moda_cocukvebebekmoda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çocuk ve Bebek Moda"));
        button.click();

    }

    @When("^Category erkek moda Subcategory tum moda urunleri")
    public void erkek_moda_tummodaurunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Moda Ürünleri"));
        button.click();

    }

    @When("^Category erkek moda Subcategory indirim")
    public void erkek_moda_indirim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement erkek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[15]"));
        erkek_moda.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("İndirim"));
        button.click();

    }


    //---------------------------------------------------------------------


        @When("^Category cocuk ve bebek moda Subcategory kiz bebek kiyafet")
    public void cocuk_ve_bebek_moda_kizbebekkiyafet() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement cocuk_ve_bebek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[16]"));
        cocuk_ve_bebek_moda.click();

        Thread.sleep(1000);

            Actions actions2 = new Actions(driver);
            int yOffset2 = 100; // Aşağı kaydırma mesafesi
            actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Kız Bebek Kıyafet"));
        button.click();

    }

    @When("^Category cocuk ve bebek moda Subcategory kiz bebek ayakabbisi")
    public void cocuk_ve_bebek_moda_kizbebekayakkabisi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement cocuk_ve_bebek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[16]"));
        cocuk_ve_bebek_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Kız Bebek Ayakkabısı"));
        button.click();

    }

    @When("^Category cocuk ve bebek moda Subcategory erkek bebek kiyafet")
    public void cocuk_ve_bebek_moda_erkekbebekkiyafet() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement cocuk_ve_bebek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[16]"));
        cocuk_ve_bebek_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Erkek Bebek Kıyafet"));
        button.click();

    }


    @When("^Category cocuk ve bebek moda Subcategory erkek bebek ayakkabi")
    public void cocuk_ve_bebek_moda_erkekbebekayakkabi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement cocuk_ve_bebek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[16]"));
        cocuk_ve_bebek_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Erkek Bebek Ayakkabı"));
        button.click();

    }

    @When("^Category cocuk ve bebek moda Subcategory bebek moda")
    public void cocuk_ve_bebek_moda_bebekmoda() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement cocuk_ve_bebek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[16]"));
        cocuk_ve_bebek_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Bebek Moda"));
        button.click();

    }

    @When("^Category cocuk ve bebek moda Subcategory tum moda urunleri")
    public void cocuk_ve_bebek_moda_tummodaurunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement cocuk_ve_bebek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[16]"));
        cocuk_ve_bebek_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Tüm Moda Ürünleri"));
        button.click();

    }

    @When("^Category cocuk ve bebek moda Subcategory indirim")
    public void cocuk_ve_bebek_moda_indirim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement cocuk_ve_bebek_moda = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[16]"));
        cocuk_ve_bebek_moda.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("İndirim"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category mutfak Subcategory kucuk mutfak aletleri")
    public void mutfak_kucukmutfakaletleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Küçük Mutfak Aletleri"));
        button.click();

    }

    @When("^Category mutfak Subcategory cay ve kahve")
    public void mutfak_cayvekahve() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çay ve Kahve"));
        button.click();

    }

    @When("^Category mutfak Subcategory blender, mikser ve mutfak robotlari")
    public void mutfak_blender() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Blender, Mikser ve Mutfak Robotları"));
        button.click();

    }

    @When("^Category mutfak Subcategory tost makineleri")
    public void mutfak_tostmakineleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tost Makineleri"));
        button.click();

    }

    @When("^Category mutfak Subcategory tencereler ve tavalar")
    public void mutfak_tencerelvetavalar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tencereler ve Tavalar"));
        button.click();

    }

    @When("^Category mutfak Subcategory sofra esyalari")
    public void mutfak_sofraesyalari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Sofra Eşyaları"));
        button.click();

    }

    @When("^Category mutfak Subcategory yemek takimlari")
    public void mutfak_yemektakimlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Yemek Takımları"));
        button.click();

    }

    @When("^Category mutfak Subcategory su isiticilari ve cay makineleri")
    public void mutfak_suisitici() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Su Isıtıcıları ve Çay Makineleri"));
        button.click();

    }

    @When("^Category mutfak Subcategory kahve makineleri")
    public void mutfak_kahvemakineleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kahve Makineleri"));
        button.click();

    }

    @When("^Category mutfak Subcategory filtre kahve makineleri")
    public void mutfak_filtrekahve() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Filtre Kahve Makineleri"));
        button.click();

    }

    @When("^Category mutfak Subcategory turk kahvesi makineleri")
    public void mutfak_turkkahvesi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Türk Kahvesi Makineleri"));
        button.click();

    }

    @When("^Category mutfak Subcategory espresso ve kapuçino makineleri")
    public void mutfak_espresso() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Espresso ve Kapuçino Makineleri"));
        button.click();

    }

    @When("^Category mutfak Subcategory mutfak aletleri ve araclari")
    public void mutfak_mutfakaletleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Mutfak Aletleri ve Araçları"));
        button.click();

    }

    @When("^Category mutfak Subcategory mikrodalga firinlar")
    public void mutfak_mikrodalga() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Mikrodalga Fırınlar"));
        button.click();

    }

    @When("^Category mutfak Subcategory firina dayanikli mutfak esyalari")
    public void mutfak_firinadayanikli() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Fırına Dayanıklı Mutfak Eşyaları"));
        button.click();

    }

    @When("^Category mutfak Subcategory utuler")
    public void mutfak_utuler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Ütüler"));
        button.click();

    }

    @When("^Category mutfak Subcategory mutfak saklama ve duzenleme")
    public void mutfak_mutfaksaklama() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Mutfak Saklama ve Düzenleme"));
        button.click();

    }

    @When("^Category mutfak Subcategory ankastre firinlar")
    public void mutfak_ankastre() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Ankastre Fırınlar"));
        button.click();

    }

    @When("^Category mutfak Subcategory buzdolaplari")
    public void mutfak_buzdolaplari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Buzdolapları"));
        button.click();

    }

    @When("^Category mutfak Subcategory davlumbazlar")
    public void mutfak_davlumbazlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Davlumbazlar"));
        button.click();

    }

    @When("^Category mutfak Subcategory mini buzdolaplari")
    public void mutfak_minibuzdolaplari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Mini Buzdolapları"));
        button.click();

    }

    @When("^Category mutfak Subcategory beyaz esya parca ve aksesuarlari")
    public void mutfak_beyazesya() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Beyaz Eşya Parça ve Aksesuarları"));
        button.click();

    }

    @When("^Category mutfak Subcategory tum mutfak urunleri")
    public void mutfak_tummutfakurunleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement mutfak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[17]"));
        mutfak.click();

        Thread.sleep(1000);

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        WebElement button = driver.findElement(By.linkText("Tüm Mutfak Ürünleri"));
        button.click();

    }


    //---------------------------------------------------------------------


    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory davullar ve perkusyonlar")
    public void muzik_ekipmanlari_ve_enstrumanlaridavullarperkusyonlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Davullar ve Perküsyonlar"));
        button.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory dj ve vj ekipmanlari")
    public void muzik_ekipmanlari_ve_dj() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("DJ ve VJ Ekipmanları"));
        button.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory genel muzik aksesuarlari")
    public void muzik_ekipmanlari_ve_genelmuzık() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Genel Müzik Aksesuarları"));
        button.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory gitarlar, baslar ve ekipmanlari")
    public void muzik_ekipmanlari_ve_gitarlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Gitarlar, Baslar ve Ekipmanları"));
        button.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory kayit ekipmanlari")
    public void muzik_ekipmanlari_ve_kayit() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kayıt Ekipmanları"));
        button.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory mikrofonlar")
    public void muzik_ekipmanlari_ve_mikrofonlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Mikrofonlar"));
        button.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory klavyeler ve piyanolar")
    public void muzik_ekipmanlari_ve_klavyeler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Klavyeler ve Piyanolar"));
        button.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory synthesizer, sampler ve dijital enstrumanlar")
    public void muzik_ekipmanlari_ve_sampler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Synthesizer, Sampler ve Dijital Enstrümanlar"));
        button.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory uflemeli enstrumanlar")
    public void muzik_ekipmanlari_ve_uflemeli() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Üflemeli Enstrümanlar"));
        button.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory yayli calgilar")
    public void muzik_ekipmanlari_ve_yayli() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Yaylı Çalgılar"));
        button.click();

    }

    @When("^Category muzik ekipmanlari ve enstrumanlari Subcategory tum muzik ekipmanlari ve enstrumanlari")
    public void muzik_ekipmanlari_ve_tum() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement muzik_ekipmanlari_ve_enstrumanlari = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[18]"));
        muzik_ekipmanlari_ve_enstrumanlari.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Müzik Ekipmanları ve Enstrümanları"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category ofis ve kirtasiye Subcategory kalemler ve yazi malzemeleri")
    public void ofis_ve_kirtasiyekalemler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kalemler ve Yazı Malzemeleri"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory ajandalar")
    public void ofis_ve_ajandalar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ajandalar"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory defterler ve kagit urunleri")
    public void ofis_ve_defterler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Defterler ve Kağıt Ürünleri"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory ofis malzemeleri")
    public void ofis_ve_ofismalzemeleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ofis Malzemeleri"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory okul ve egitim malzemeleri")
    public void ofis_ve_okulveegitimmalzemeleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Okul ve Eğitim Malzemeleri"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory resim ve el isi malzemeleri")
    public void ofis_ve_resim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Resim ve El İşi Malzemeleri"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory ofis elektronigi")
    public void ofis_ve_elektronigi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ofis Elektroniği"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory mobilya ve aydinlatma")
    public void ofis_ve_mobilya() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Mobilya ve Aydınlatma"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory yazicilar ve tarayicilar")
    public void ofis_ve_yazicilar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Yazıcılar ve Tarayıcılar"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory dolma kalemler")
    public void ofis_ve_dolmakalemler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Dolma Kalemler"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory versatil kalemler")
    public void ofis_ve_versatilkalemler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Verstali Kalemler"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory tukenmez kalemler ve kartuslar")
    public void ofis_ve_tukenmez() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tükenmez Kalemler ve Kartuşlar"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory kursun ve kuru boya kalemler")
    public void ofis_ve_kursunkuru() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kurşun ve Kuru Boya Kalemler"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory fosforlu kalemler")
    public void ofis_ve_fosforlu() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Fosforlu Kalemler"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory teknik cizim urunleri")
    public void ofis_ve_teknikcizim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Teknik Çizim Ürünleri"));
        button.click();

    }

    @When("^Category ofis ve kirtasiye Subcategory tum ofis ve kirtasiye urunleri")
    public void ofis_ve_tum() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement ofis_ve_kirtasiye = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[19]"));
        ofis_ve_kirtasiye.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Ofis ve Kırtasiye Ürünleri"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category otomotiv Subcategory agir is araci ve ticari arac ekipmanlari")
    public void otomotiv_agiris() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ağır İş Aracı ve Ticari Araç Ekipmanları"));
        button.click();

    }

    @When("^Category otomotiv Subcategory aletler ve ekipmanlar")
    public void otomotiv_aletler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Aletler ve Ekipmanlar"));
        button.click();

    }

    @When("^Category otomotiv Subcategory navigasyon cihazlari")
    public void otomotiv_navigasyon() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Nagivasyon Cihazları"));
        button.click();

    }

    @When("^Category otomotiv Subcategory aksesuarlar")
    public void otomotiv_aksesuarlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Aksesuarlar"));
        button.click();

    }

    @When("^Category otomotiv Subcategory koltuklar ve aksesuarlari")
    public void otomotiv_koltuklar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Koltuklar ve Aksesuarları"));
        button.click();

    }

    @When("^Category otomotiv Subcategory lastikler ve jantlar")
    public void otomotiv_lastikler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Lastikler ve Jantlar"));
        button.click();

    }

    @When("^Category otomotiv Subcategory oto parcalari")
    public void otomotiv_otoparcalari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Oto Parçaları"));
        button.click();

    }

    @When("^Category otomotiv Subcategory elektronik urunler")
    public void otomotiv_elektronik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Elektronik Ürünler"));
        button.click();

    }

    @When("^Category otomotiv Subcategory bakim urunleri")
    public void otomotiv_bakim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bakım Ürünleri"));
        button.click();

    }

    @When("^Category otomotiv Subcategory motosiklet aksesuarlari ve parcalari")
    public void otomotiv_motosiklet() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Motosiklet Aksesuarları ve Parçaları"));
        button.click();

    }

    @When("^Category otomotiv Subcategory tum otomotiv urunleri")
    public void otomotiv_tumu() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement otomotiv = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[20]"));
        otomotiv.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Otomotiv Ürünleri"));
        button.click();

    }



    //---------------------------------------------------------------------

    @When("^Category oyuncak Subcategory yapi insa oyuncaklari")
    public void oyuncak_yapiinsa() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Yapı İnşa Oyuncakları"));
        button.click();

    }

    @When("^Category oyuncak Subcategory yapbozlar ve bulmacalar")
    public void oyuncak_yapbozlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Yapbozlar ve Bulmacalar"));
        button.click();

    }

    @When("^Category oyuncak Subcategory kutu oyunlari")
    public void oyuncak_kutuoyunlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kutu Oyunları"));
        button.click();

    }

    @When("^Category oyuncak Subcategory oyuncak figurler ve figur setleri")
    public void oyuncak_figur() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Oyuncak Figürler ve Figür Setleri"));
        button.click();

    }

    @When("^Category oyuncak Subcategory arabalar")
    public void oyuncak_arabalar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Arabalar"));
        button.click();

    }

    @When("^Category oyuncak Subcategory egitim ve bilim oyuncaklari")
    public void oyuncak_egitimvebilim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Eğitim ve Bilim Oyuncakları"));
        button.click();

    }

    @When("^Category oyuncak Subcategory bebek ve kucuk cocuk oyuncaklari")
    public void oyuncak_bebek() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bebek ve Küçük Çocuk Oyuncakları"));
        button.click();

    }

    @When("^Category oyuncak Subcategory oyuncak bebekler ve aksesuarlari")
    public void oyuncak_oyuncakbebekler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Oyuncak Bebekler ve Aksesuarları"));
        button.click();

    }

    @When("^Category oyuncak Subcategory oyunlar ve oyun aksesuarlari")
    public void oyuncak_oyunaksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Oyunlar ve Oyun Aksesuarları"));
        button.click();

    }

    @When("^Category oyuncak Subcategory dolgu ve pelus oyuncaklar")
    public void oyuncak_pelus() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Dolgu ve Pelüş Oyuncaklar"));
        button.click();

    }

    @When("^Category oyuncak Subcategory model yapimi ve hobi gerecleri")
    public void oyuncak_modelyapimi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Model Yapımı ve Hobi Gereçleri"));
        button.click();

    }

    @When("^Category oyuncak Subcategory kart oyunlari")
    public void oyuncak_kartoyunlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kart Oyunları"));
        button.click();

    }

    @When("^Category oyuncak Subcategory spor ve acik hava oyuncaklari")
    public void oyuncak_sporveacikhava() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Spor ve Açık Hava Oyuncakları"));
        button.click();

    }

    @When("^Category oyuncak Subcategory drone'lar")
    public void oyuncak_dronelar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Drone'lar"));
        button.click();

    }

    @When("^Category oyuncak Subcategory resim ve el isi")
    public void oyuncak_resim() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Resim ve El İşi"));
        button.click();

    }

    @When("^Category oyuncak Subcategory elektronik oyuncaklar")
    public void oyuncak_elektronik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Elektronik Oyuncaklar"));
        button.click();

    }

    @When("^Category oyuncak Subcategory tum urunler")
    public void oyuncak_tum() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement oyuncak = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[21]"));
        oyuncak.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Ürünler"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category saglik, bakim, temizlik Subcategory bebek ve cocuk bakimi")
    public void saglik_bakim_temizlik_bebek() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement saglik_bakim_temizlik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[22]"));
        saglik_bakim_temizlik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bebek ve Çocuk Bakımı"));
        button.click();

    }

    @When("^Category saglik, bakim, temizlik Subcategory dis bakimi")
    public void saglik_bakim_temizlik_disbakimi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement saglik_bakim_temizlik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[22]"));
        saglik_bakim_temizlik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Diş Bakımı"));
        button.click();

    }

    @When("^Category saglik, bakim, temizlik Subcategory pedler ve hijyen urunleri")
    public void saglik_bakim_temizlik_pedler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement saglik_bakim_temizlik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[22]"));
        saglik_bakim_temizlik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Pedler ve Hijyen Ürünleri"));
        button.click();

    }

    @When("^Category saglik, bakim, temizlik Subcategory cinsel saglik ve aile planlamasi")
    public void saglik_bakim_temizlik_cinselsaglik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement saglik_bakim_temizlik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[22]"));
        saglik_bakim_temizlik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Cinsel Sağlık ve Aile Planlaması"));
        button.click();

    }

    @When("^Category saglik, bakim, temizlik Subcategory deterjanlar")
    public void saglik_bakim_temizlik_deterjanlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement saglik_bakim_temizlik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[22]"));
        saglik_bakim_temizlik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Deterjanlar"));
        button.click();

    }

    @When("^Category saglik, bakim, temizlik Subcategory temizlik aletleri")
    public void saglik_bakim_temizlik_temizlikaletleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement saglik_bakim_temizlik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[22]"));
        saglik_bakim_temizlik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Temizlik Aletleri"));
        button.click();

    }

    @When("^Category saglik, bakim, temizlik Subcategory tum saglik ve bakim urunleri")
    public void saglik_bakim_temizlik_tum() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement saglik_bakim_temizlik = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[22]"));
        saglik_bakim_temizlik.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Sağlık ve Bakım Ürünleri"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category spor ve outdoor Subcategory kamp ve doga yuruyusu")
    public void spor_ve_outdoor_kamp() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kamp ve Doğa Yürüyüşü"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory sivi alimi")
    public void spor_ve_outdoor_sivialimi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Sıvı Alımı"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory fitness ve egzersiz")
    public void spor_ve_outdoor_fitness() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Fitness ve Egzersiz"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory spor ayakkabilari")
    public void spor_ve_outdoor_sporayakkabilari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Spor Ayakkabıları"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory spor ve outdoor giyim urunleri")
    public void spor_ve_outdoor_sporveoutdoor() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Spor ve Outdoor Giyim Ürünleri"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory spor teknolojisi")
    public void spor_ve_outdoor_sporteknoljisi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Spor Teknolojisi"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory aktivite takipcileri")
    public void spor_ve_outdoor_aktivite() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Aktivite Takipçileri"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory aksiyon kameralari")
    public void spor_ve_outdoor_aksiyonkamera() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Aksiyon Kameraları"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory kosu")
    public void spor_ve_outdoor_kosu() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Koşu"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory cadirlar")
    public void spor_ve_outdoor_cadirlar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Çadırlar"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory kamp bicaklari ve aletler")
    public void spor_ve_outdoor_kampbicaklari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kamp Bıçakları ve Aletler"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory kamp mutfak gerecleri")
    public void spor_ve_outdoor_kampmutfak() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kamp Mutfak Gereçleri"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory sirt cantalari")
    public void spor_ve_outdoor_sirtcantalari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Sırt Çantaları"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory uyku tulumlari")
    public void spor_ve_outdoor_uykutulumlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Uyku Tulumları"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory isiklar ve fenerler")
    public void spor_ve_outdoor_isiklarvefenerler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Işıklar ve Fenerler"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory balikcilik")
    public void spor_ve_outdoor_balikcilik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Balıkçılık"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory basketbol")
    public void spor_ve_outdoor_basketbol() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Basketbol"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory futbol")
    public void spor_ve_outdoor_futbol() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Futbol"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory masa tenisi")
    public void spor_ve_outdoor_masatenisi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Masa Tenisi"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory kis sporlari")
    public void spor_ve_outdoor_kissporlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kış Sporları"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory voleybol")
    public void spor_ve_outdoor_voleybol() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Voleybol"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory su sporlari")
    public void spor_ve_outdoor_susporlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Su Sporları"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory tenis")
    public void spor_ve_outdoor_tenis() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tenis"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory avcilik")
    public void spor_ve_outdoor_avclik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Avcılık"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory dovus sanatlari")
    public void spor_ve_outdoor_dovus() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Dövüş Sanatları"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory bisikletler ve bisiklet ekipmanlari")
    public void spor_ve_outdoor_bisikletlerveekipmanlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bisikletler ve Bisiklet Ekipmanları"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory scooter'lar")
    public void spor_ve_outdoor_scooter() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Scooter'lar"));
        button.click();

    }

    @When("^Category spor ve outdoor Subcategory tum urunler")
    public void spor_ve_outdoor_tumu() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement spor_ve_outdoor = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[23]"));
        spor_ve_outdoor.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Ürünler"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category telefon Subcategory cep telefonlari")
    public void telefon_cep() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Cep Telefonları"));
        button.click();
    }

    @When("^Category telefon Subcategory kiliflar ve kapaklar")
    public void telefon_kiliflar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kılıflar ve Kapaklar"));
        button.click();
    }

    @When("^Category telefon Subcategory powerbank'ler")
    public void telefon_powerbank() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Powerbank'ler"));
        button.click();
    }

    @When("^Category telefon Subcategory ekran koruyucular")
    public void telefon_ekrankoruyucular() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ekran Koruyucular"));
        button.click();
    }

    @When("^Category telefon Subcategory kulakliklar")
    public void telefon_kulakliklar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kulaklıklar"));
        button.click();
    }

    @When("^Category telefon Subcategory buyuk tuslu cep telefonlari")
    public void telefon_buyuktuslucep() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Büyük Tuşlu Cep Telefonları"));
        button.click();
    }

    @When("^Category telefon Subcategory sarj aletleri")
    public void telefon_sarjaletleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Şarj Aletleri"));
        button.click();
    }

    @When("^Category telefon Subcategory giyilebilir teknoloji")
    public void telefon_giyilebilir() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Giyilebilir Teknoloji"));
        button.click();
    }

    @When("^Category telefon Subcategory oto tutucular")
    public void telefon_ototutucular() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Cep Telefonları"));
        button.click();
    }

    @When("^Category telefon Subcategory telefonlar, VOIP ve aksesuarlari")
    public void telefon_voip() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Telefonlar, VOIP ve Aksesuarları"));
        button.click();
    }

    @When("^Category telefon Subcategory monte sistemleri ve stantlar")
    public void telefon_monte() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Monte Sistemleri ve Stantlar"));
        button.click();
    }

    @When("^Category telefon Subcategory stylus kalemler")
    public void telefon_stylus() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Stylus Kalemler"));
        button.click();
    }

    @When("^Category telefon Subcategory cep telefonu aksesuarlari")
    public void telefon_ceptelefonuaksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Cep Telefonu Aksesuarları"));
        button.click();
    }

    @When("^Category telefon Subcategory tum urunler")
    public void telefon_tumurunler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement telefon = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[24]"));
        telefon.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Ürünler"));
        button.click();
    }

    //---------------------------------------------------------------------

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory televizyon")
    public void televizyonlar_ve_ev_sinema_sistemleri_tv() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Televizyon"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory ev sinema sistemleri")
    public void televizyonlar_ve_ev_sinema_sistemleri_evsinema() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ev Sinema Sistemleri"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory set ustu kutular")
    public void televizyonlar_ve_ev_sinema_sistemleri_setustukutular() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Set Üstü Kutular"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory projeksiyon cihazlari")
    public void televizyonlar_ve_ev_sinema_sistemleri_projeksiyon_cihazlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Projeksiyon Cihazları"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory av alicilar ve amfiler")
    public void televizyonlar_ve_ev_sinema_sistemleri_av() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("AV Alıcılar ve Amfiler"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory hdmi kablolar")
    public void televizyonlar_ve_ev_sinema_sistemleri_hdmi() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("HDMI Kablolar"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory hoparlorler")
    public void televizyonlar_ve_ev_sinema_sistemleri_hoparlorler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Hoparlörler"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory uydu televizyon sistemleri")
    public void televizyonlar_ve_ev_sinema_sistemleri_uydutv() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Uydu Televizyon Sistemleri"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory uzaktan kumandalar")
    public void televizyonlar_ve_ev_sinema_sistemleri_uzaktankumandalar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Uzaktan Kumandalar"));
        button.click();

    }


    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory blu-ray oynaticilar ve kayit cihazlari")
    public void televizyonlar_ve_ev_sinema_sistemleri_bluray() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Blu-Ray Oynatıcılar ve Kayıt Cihazları"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory tv ekran koruyuculari")
    public void televizyonlar_ve_ev_sinema_sistemleri_tvekran() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("TV Ekran Koruyucuları"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory kablolar")
    public void televizyonlar_ve_ev_sinema_sistemleri_kablolar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Kablolar"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory ev sinemasi aksesuarlari")
    public void televizyonlar_ve_ev_sinema_sistemleri_evsinemasiaks() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Ev Sineması Aksesuarları"));
        button.click();

    }

    @When("^Category televizyonlar ve ev sinema sistemleri Subcategory tum urunler")
    public void televizyonlar_ve_ev_sinema_sistemleri_tum() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement televizyonlar_ve_ev_sinema_sistemleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[25]"));
        televizyonlar_ve_ev_sinema_sistemleri.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Ürünler"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category video oyunu ve konsol Subcategory PlayStation 4")
    public void video_oyunu_ve_konsol_ps4() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PlayStation 4"));
        button.click();


    }

    @When("^Category video oyunu ve konsol Subcategory PlayStation 4 konsollari")
    public void video_oyunu_ve_konsol_ps4konsollari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PlayStation 4 Konsolları"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory PlayStation 4 oyunlari")
    public void video_oyunu_ve_konsol_ps4oyunlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PlayStation 4 Oyunları"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory PlayStation 4 aksesuarlari")
    public void video_oyunu_ve_konsol_ps4aksesuar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PlayStation 4 Aksesuarları"));
        button.click();


    }

    @When("^Category video oyunu ve konsol Subcategory Nintendo Switch")
    public void video_oyunu_ve_konsol_ns() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Nintendo Switch"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory Nintendo Switch konsollari")
    public void video_oyunu_ve_konsol_nskonsollari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Nintendo Switch Konsolları"));
        button.click();


    }

    @When("^Category video oyunu ve konsol Subcategory Nintendo Switch oyunlari")
    public void video_oyunu_ve_konsol_nsoyunlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Nintendo Switch Oyunları"));
        button.click();


    }

    @When("^Category video oyunu ve konsol Subcategory Nintendo Switch aksesuarlari")
    public void video_oyunu_ve_konsol_nsaksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Nintendo Switch Aksesuarları"));
        button.click();


    }

    @When("^Category video oyunu ve konsol Subcategory PC")
    public void video_oyunu_ve_konsol_pc() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PC"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory PC oyun kulakliklari")
    public void video_oyunu_ve_konsol_pcoyunkulakliklari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PC Oyun Kulaklıkları"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory PC oyun klavyeleri")
    public void video_oyunu_ve_konsol_pcoyunklavyeleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PC Oyun Klavyeleri"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory PC oyun mouse'lari")
    public void video_oyunu_ve_konsol_pcoyunmouse() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PC Oyun Mouse'ları"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory PC oyunlari")
    public void video_oyunu_ve_konsol_pcoyunlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PC Oyunları"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory PC aksesuarlari")
    public void video_oyunu_ve_konsol_pcaksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PC Aksesuarları"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory Xbox One")
    public void video_oyunu_ve_konsol_xboxone() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Xbox One"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory Xbox One konsollari")
    public void video_oyunu_ve_konsol_xboxonekonsol() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Xbox One Konsolları"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory Xbox One oyunlari")
    public void video_oyunu_ve_konsol_xboxoneoyunlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Xbox One Oyunları"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory Xbox One aksesuarlari")
    public void video_oyunu_ve_konsol_xboxoneaksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Xbox One Aksesuarları"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory PlayStation 3")
    public void video_oyunu_ve_konsol_ps3() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("PlayStation 3"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory Xbox 360")
    public void video_oyunu_ve_konsol_xboxucyuzaltmis() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Xbox 360"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory eski sistemler ve mikro konsollar")
    public void video_oyunu_ve_konsol_eskisistemler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Eski Sistemler ve Mikro Konsollar"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory sanal gerceklik")
    public void video_oyunu_ve_konsol_sanalkgerceklik() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Sanal Gerçeklik"));
        button.click();

    }

    @When("^Category video oyunu ve konsol Subcategory tum urunler")
    public void video_oyunu_ve_konsol_tumurunler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement video_oyunu_ve_konsol = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[26]"));
        video_oyunu_ve_konsol.click();

        Actions actions2 = new Actions(driver);
        int yOffset2 = 100; // Aşağı kaydırma mesafesi
        actions2.moveByOffset(0, yOffset2).perform();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Ürünler"));
        button.click();

    }

    //---------------------------------------------------------------------

    @When("^Category yapi market Subcategory elektrikli aletler ve el aletleri")
    public void yapi_market_elektrikli() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Elektrikli Aletler ve El Aletleri"));
        button.click();

    }

    @When("^Category yapi market Subcategory elektrikli aletler")
    public void yapi_market_elektriklialetler() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Elektrikli Aletler"));
        button.click();

    }

    @When("^Category yapi market Subcategory akulu vidalama aletleri")
    public void yapi_market_akuluvidalama() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Akülü Vidalama Aletleri"));
        button.click();

    }

    @When("^Category yapi market Subcategory matkaplar")
    public void yapi_market_matkaplar() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Matkaplar"));
        button.click();

    }

    @When("^Category yapi market Subcategory el aletleri")
    public void yapi_market_elaletleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("El Aletleri"));
        button.click();

    }

    @When("^Category yapi market Subcategory bahce el aletleri")
    public void yapi_market_bahcelaletleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Bahçe El Aletleri"));
        button.click();

    }

    @When("^Category yapi market Subcategory alet takimlari")
    public void yapi_market_alettakimlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Alet Takımları"));
        button.click();

    }

    @When("^Category yapi market Subcategory hirdavat")
    public void yapi_market_hirdavat() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Hırdavat"));
        button.click();

    }

    @When("^Category yapi market Subcategory mutfak ve banyo armaturleri")
    public void yapi_market_mutfakbanyo() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Mutfak ve Banyo Armatürleri"));
        button.click();

    }

    @When("^Category yapi market Subcategory alet cantalari")
    public void yapi_market_aletcantalari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Alet Çantaları"));
        button.click();

    }

    @When("^Category yapi market Subcategory elektrik malzemeleri")
    public void yapi_market_elektrikmalzemeleri() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Elektrik Malzemeleri"));
        button.click();

    }

    @When("^Category yapi market Subcategory guvenlik ve koruma")
    public void yapi_market_guvenlikvekoruma() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Güvenlik ve Koruma"));
        button.click();

    }

    @When("^Category yapi market Subcategory elektrikli el aletleri aksesuarlari")
    public void yapi_market_elaletleriaksesuarlari() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Elektrikli El Aletleri Aksesuarları"));
        button.click();

    }

    @When("^Category yapi market Subcategory depo ve ev duzenleme")
    public void yapi_market_depoev() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Depo ve Ev Düzenleme"));
        button.click();

    }
    @When("^Category yapi market Subcategory tum yapi market urunleri")
    public void yapi_market_tum() throws Throwable{

        WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        Thread.sleep(1000);

        WebElement tumunu_goruntule = driver.findElement(By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']"));
        tumunu_goruntule.click();

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        int yOffset = 500; // Aşağı kaydırma mesafesi
        actions.moveByOffset(0, yOffset).perform();

        Thread.sleep(1000);

        WebElement yapi_market = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[27]"));
        yapi_market.click();

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.linkText("Tüm Yapı Market Ürünleri"));
        button.click();

    }

    //---------------------------------------------------------------------




    @When("^Open musteri hizmetleri")
    public void musteri_hizmetleri() throws Throwable{

        WebElement musteri_hizmetleri = driver.findElement(By.xpath("//a[@class='nav-a  '][5]"));
        musteri_hizmetleri.click();

        /*WebElement Tumu = driver.findElement(By.id("nav-hamburger-menu"));
        Tumu.click();

        WebElement musteri_hizmetleri = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[30]"));
        musteri_hizmetleri.click();*/

    }

    @When("^Open satis yap")
    public void satis_yap() throws Throwable{

        WebElement satis_yap = driver.findElement(By.xpath("//a[@class='nav-a  '][1]"));
        satis_yap.click();

    }

    @When("^Open gunun firsatlari")
    public void gunun_firsatlari() throws Throwable{

        WebElement gunun_firsatlari = driver.findElement(By.xpath("//a[@class='nav-a  '][3]"));
        gunun_firsatlari.click();

    }

    @When("^Open prime")
    public void prime() throws Throwable{

        WebElement prime = driver.findElement(By.xpath("//a[@class='nav-a  '][4]"));
        prime.click();

    }


    //---------------------------------------------------------------------




}
