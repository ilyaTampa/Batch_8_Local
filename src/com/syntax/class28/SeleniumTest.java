package com.syntax.class28;

public class SeleniumTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Asghar Nazir\\Downloads\\Compressed\\chromedriver.exe");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.google.com/");

    }
}
