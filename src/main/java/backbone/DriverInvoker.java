package backbone;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInvoker {

    private static WebDriver driver;
    private static DriverInvoker driverInvoker;

    private DriverInvoker() {}

    public static WebDriver getInstance() {
        if (driver==null){
            return driverInvoker.getDriver();
        }
        else return driver;
    }


    public WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        return driver;
    }
}
