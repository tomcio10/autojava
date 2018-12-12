package selenium.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordpressTests {

    WebDriver driver;
    @BeforeEach
    public void startDriver(){
        driver = new ChromeDriver();

    }
    @Test
    public void canFindWordPressTests() {
        driver.get("http://automatyzacja.benedykt.net/");

        WebElement linkBox = driver.findElement(By.cssSelector(".entry-title > a"));
        linkBox.click();

        WebElement commentBox = driver.findElement(By.cssSelector("#comment"));
        commentBox.sendKeys("Kasia lubi szkolenie z automatyzacji z uwagi na wsparcie");

        WebElement podpisBox = driver.findElement(By.cssSelector("#author"));
        podpisBox.sendKeys("Kasia");

        WebElement emailsBox = driver.findElement(By.cssSelector("#email"));
        emailsBox.sendKeys("kasia@lubiecie.pl");

        WebElement urlBox = driver.findElement(By.cssSelector("#url"));
        urlBox.sendKeys("http://automatyzacja.benedykt.net/uncategorized/et-voluptatem-ut-deleniti-non-rerum-eos-minima-consectetur/");

        WebElement submitBox = driver.findElement(By.cssSelector("#submit"));
        submitBox.submit();
    }

    @AfterEach
    public void closeDriver(){
        driver.quit();
    }
}