package com.kodilla.selenium;
package com.kodilla.selenium.allegro;

        import org.openqa.selenium.Alert;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"allegro.metrumHeader.search\"]/div/form/input"));
        inputField.sendKeys("Mavic mini");
        inputField = driver.findElement(By.xpath("//*[@id=\"allegro.metrumHeader.search\"]/div/form/input/div/div/span"));
        inputField.sendKeys("Elektronika");

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
