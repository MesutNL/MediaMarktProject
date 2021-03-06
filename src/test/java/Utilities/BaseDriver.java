package Utilities;

import Pages.Parent;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            WebDriverManager.chromiumdriver().setup();
            driver=new ChromeDriver();
        }
        return driver;
    }
    public static void DriverQuit(){
        Parent.delay(5);
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
