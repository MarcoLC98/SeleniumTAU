package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public HoversPage clickHovers (){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
    public DropdownPage cliclDropdown (){
        clickLink("Dropdown");
         return new DropdownPage(driver);
    }

    public LoginPage clickFormAuth() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

}
