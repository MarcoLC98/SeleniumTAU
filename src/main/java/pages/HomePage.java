package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    
    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    
    public void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
    
    public DropdownPage cliclDropdown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    
    public LoginPage clickFormAuth() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    
    public AlertsPage clickJavaScriptsAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    
    public FileUploadPage clickFileUpload() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
}
