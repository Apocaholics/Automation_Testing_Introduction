package testCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTests {

    @Test
    void FirstTest(){
        //System.setProperty("webdriver.chrome.driver", "F:\\Projects\\WebDrivers\\chromedriver103\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://novaposhta.ua/");
        WebElement elementWithText = driver.findElement(By.xpath("//div[text()=\"Відстежити\"]"));
        String actualText = elementWithText.getText();
        String expectedText = "Відстежити";
        assertEquals(expectedText, actualText);
        driver.quit();
    }
}
