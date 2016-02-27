package Cucumber.Support;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by Ruslan Shevchenko on 27.02.2016.
 */
public class AllureYandex {

    @Attachment(value="{0}", type="image/png")
    public static byte[] makeScreenshotWindow(String name)
    {
        byte[] screenshot = null;
        screenshot = ((TakesScreenshot) WebDriverHolder.getDriver()).getScreenshotAs(OutputType.BYTES);
        return screenshot;
    }

    @Attachment(value="{0}", type = "image/png")
    public static byte[] makeScreenshotScreen(String name) {
        BufferedImage image = null;
        try {
            image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (AWTException e) {
            e.printStackTrace();
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "jpg", baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            baos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] imageInByte = baos.toByteArray();
        try {
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageInByte;
    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String makeTextLog(String attachName, String message) {
        return message;
    }

}
