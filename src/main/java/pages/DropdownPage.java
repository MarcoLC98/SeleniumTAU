package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private final By dropdown = By.id("dropdown");
    private WebDriver driver;

    public DropdownPage(WebDriver driver) {
        this.driver = this.driver;
    }

    public void selectFromDropdown(String option) {
        findDropdownElement().deselectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements =
                findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    private Select findDropdownElement() {
        return new Select(driver.findElement(dropdown));
    }

}
