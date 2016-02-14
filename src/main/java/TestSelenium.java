import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by alex on 1/10/2016.
 */
public class TestSelenium {
    @Parameters({ "config-file" })
    @Test
    public void init(String configFile) throws FindFailed, IOException {
        Properties p = new Properties();
        FileInputStream  conf = new FileInputStream(configFile);
        p.load(conf);

        String siteurl = p.getProperty("BASEURL");
        String pathOfImage = p.getProperty("PATH");

        Screen screen = new Screen();
        Pattern image1 = new Pattern(pathOfImage+ "images.png");
        Pattern image2 = new Pattern(pathOfImage+ "spotlight.png");
        Pattern image3 = new Pattern(pathOfImage+ "search.png");
        Pattern image4 = new Pattern(pathOfImage+ "mooon.png");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(siteurl);
        screen.click(image1);
        screen.type(image2, "space#ENTER.");
        screen.click(image3);
        screen.click(image4);
        driver.close();
        driver.quit();
    }
}
