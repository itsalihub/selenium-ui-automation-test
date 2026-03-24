package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://the-internet.herokuapp.com/login");

            Thread.sleep(2000);

            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));

            username.sendKeys("tomsmith");
            password.sendKeys("SuperSecretPassword!");

            loginBtn.click();

            Thread.sleep(3000);
            String successMsg = driver.findElement(By.id("flash")).getText();

            if (successMsg.contains("You logged into a secure area")) {
                System.out.println("TEST PASSED");
            } else {
                System.out.println("TEST FAILED");
            }

            Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }
    }
}