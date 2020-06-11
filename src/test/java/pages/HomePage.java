package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(){

    }

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //navbar

    @FindBy(xpath = "//*[@id='services']/div/h2")
    private WebElement services;

    @FindBy(xpath = "//*[@id=\"portfolio\"]/div/h2")
    private WebElement portfolio;

    @FindBy(xpath = "//*[@id=\"about\"]/div/h2")
    private WebElement about;

    @FindBy(xpath = "//*[@id=\"contact\"]/div/h2")
    private WebElement contact;

    @FindBy(xpath = "//*[@id=\"client\"]/div/h2")
    private WebElement client;


    //navbar action

    public void clickServices() throws InterruptedException {
        services.click();
        Thread.sleep(2000);
    }

    public void clickPortfolio() throws InterruptedException {
        portfolio.click();
        Thread.sleep(2000);
    }

    public void clickAbout() throws InterruptedException {
        about.click();
        Thread.sleep(2000);
    }

    public void clickContact() throws InterruptedException {
        contact.click();
        Thread.sleep(2000);
    }

    public void clickClient() throws InterruptedException {
        client.click();
        Thread.sleep(2000);
    }
}