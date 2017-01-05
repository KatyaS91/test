import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static junit.framework.Assert.assertEquals;

/**
 * Created by katya on 01.01.17.
 */


public class mainTests {
 private ChromeDriver driver;

 @Before
 public void setUp(){
  System.setProperty("webdriver.chrome.driver","/Users/katya/Documents/chromedriver");
  driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("http://tut.by");

 }
    @After
     public void escape (){
     driver.close();

 }

     @Test
     public void testAutorizationNull (){
        MainPage home = new MainPage(driver);
        ErrorPage result = home.login();
        assertEquals("Неверное имя пользователя или пароль.", result.getTitle());


 }
    @Test
    public void ForgetPassword(){
        MainPage home = new MainPage(driver);
        ErrorPage result = home.Forgetlogin();
        assertEquals("Восстановление пароля - Почта Mail.Ru", result.getTitle());
    }

    @Test
    public void CorrectLogin(){
        MainPage home = new MainPage(driver);
        ErrorPage result = home.TrueLogin();
        assertEquals("Входящие - Почта Mail.Ru", result.getTitle());
    }
    @Test
    public void Registration(){
        MainPage home = new MainPage(driver);
        ErrorPage result = home.Registration();
        assertEquals("Регистрация - Почта Mail.Ru", result.getTitle());
    }


    /*public void myFirstTest(){

       System.setProperty("webdriver.chrome.driver","/Users/katya/Documents/chromedriver");


        WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://mail.ru");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement AuthButton = driver.findElement(By.id("#mailbox__auth__button"));
        WebElement Login = driver.findElement(By.id("#mailbox__login"));
        WebElement Password = driver.findElement(By.id("#mailbox__password"));
        Login.clear();
        Password.clear();
        AuthButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Неверное имя пользователя или пароль."));
        driver.navigate().back();

        Login.sendKeys("kastus-k2015");
        Password.sendKeys("Aa123+");
        AuthButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Assert.assertTrue(driver.getTitle().contains("Входящие - Почта Mail.Ru"));
        assertEquals("Входящие - Почта Mail.Ru", driver.getTitle());
        driver.navigate().back();
        WebElement Exit = driver.findElement(By.id("js-mailbox-exit"));
        Exit.click();
        Login.clear();
        Password.clear();

        Login.sendKeys("kastus-k2015");
        Login.submit();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Неверное имя пользователя или пароль."));
        driver.navigate().back();
        Login.clear();
        Password.clear();

        Password.sendKeys("1111");
        Password.submit();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(driver.getPageSource().contains("Неверное имя пользователя или пароль."));
        driver.navigate().back();
        Login.clear();
        Password.clear();

        WebElement ForgetPassword = driver.findElement(By.id("mailbox__forget-link"));
        ForgetPassword.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Assert.assertTrue(driver.getTitle().contains("Восстановление пароля - Почта Mail.Ru"));
        assertEquals("Восстановление пароля - Почта Mail.Ru", driver.getTitle());

        driver.quit();*/



    }


