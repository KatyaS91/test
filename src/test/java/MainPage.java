import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by katya on 04.01.17.
 */
// torevert

public class MainPage {

    private ChromeDriver driver;

    public MainPage(ChromeDriver driver){
        this.driver = driver;
    }

    public ErrorPage login() {
    driver.findElement(By.id("#mailbox__auth__button")).click();
        return new ErrorPage(driver);
    }


    public ErrorPage Forgetlogin() {
        driver.findElement(By.id("#mailbox__forget-link")).click();
        return new ErrorPage(driver);
    }

    public ErrorPage TrueLogin(){
        driver.findElement(By.id("#mailbox__login")).sendKeys("kastus-k2015");
        driver.findElement(By.id("#mailbox__password")).sendKeys("Aa123+");
        return new ErrorPage(driver);
    }
    public ErrorPage Registration(){
        driver.findElement(By.className("mailbox__register__link")).click();
        return new ErrorPage(driver);

    }
}
