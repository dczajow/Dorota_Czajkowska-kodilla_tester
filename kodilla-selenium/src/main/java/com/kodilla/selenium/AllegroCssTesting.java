package com.kodilla.selenium;

public class AllegroCssTesting {
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.Select;

    import java.util.List;

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/Users/Seweryn/Documents/Development/Kodilla/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://allegro.pl");
            WebElement alertBoxButton = driver.findElement(By.xpath("//div[@aria-labelledby=\"dialog-title\"]/div[2]//button[@data-role=\"accept-consent\"]"));
            alertBoxButton.click(); // close popup window

            WebElement searchInput = driver.findElement(By.xpath("//form[@action=\"/listing\"]/input[@name=\"string\"]"));
            searchInput.sendKeys("Mavic mini");
            WebElement optionGroup = driver.findElement(By.xpath("//select[@aria-label=\"Kategoria i opcje wyszukiwania\"]"));
            Select options = new Select(optionGroup);
            options.selectByIndex(3);
            driver.findElement(By.xpath("//button[@data-role=\"search-button\"]")).click();

            // get all listings to a list
            List<WebElement> listingBoxes = driver.findElements(By.cssSelector("#opbox-listing--base > div > section > article"));
            System.out.println(listingBoxes);

            for (WebElement element: listingBoxes){
                System.out.println(element.getText());
            }

        }
    }

//poprawić destynację w githubie

