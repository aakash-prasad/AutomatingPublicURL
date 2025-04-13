package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverManager;

public class Hooks {

    @Before
    public void setup(){
        WebDriver webDriver = new ChromeDriver();
        DriverManager.setDriver(webDriver);
    }

    @After
    public void tearDown(){
        DriverManager.quitDriver();
    }
}
