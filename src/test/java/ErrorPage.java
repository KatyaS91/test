import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by katya on 04.01.17.
 */
 //comment2
 //the second comment
 // the third commit

public class ErrorPage {

    private ChromeDriver driver;

    public ErrorPage (ChromeDriver driver){
        this.driver = driver;
    }

    public String getTitle() {

        return driver.getTitle();

    }
	// the fourth comment
	//cherry pick commit
}
