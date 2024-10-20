package org.auro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Z:\\Practical Evaluation\\Selenium Demonstartion\\src\\main\\java\\org\\auro\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


        // Entering Username and Password ;)
        String allText=driver.findElement(By.xpath("//div[@class='login_password']")).getText();
        String childText=driver.findElement(By.cssSelector("div[class='login_password'] h4")).getText();
        String password=allText.replace(childText,"");
//        System.out.println(password+""+password.length());
        String userName="standard_user";
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password.trim());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();

        Thread.sleep(2000);
        // Required Validation :- <Check whether all the items have been added in the cart or not ;)>
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        System.out.println("Total No. of items in the Cart : "+driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@id='first-name'])[1]")).sendKeys("AURO SASWAT ");
        driver.findElement(By.xpath("(//input[@id='last-name'])[1]")).sendKeys("RAJ");
        driver.findElement(By.id("postal-code")).sendKeys("760010");
        Thread.sleep(3000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='finish']")).click();
        // Validating the message ;)
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.className("complete-header")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='complete-text']")).getText());
        Thread.sleep(4000);

        driver.quit();

    }
}