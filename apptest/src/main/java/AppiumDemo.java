import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDemo {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // 设备名称，在 Android 上，这个关键字目前不起作用。
        capabilities.setCapability("deviceName","Android Emulator");
        // 使用的自动化测试引擎
        capabilities.setCapability("automationName","Appium");
        // 测试的手机操作系统
        capabilities.setCapability("platformName","Android");
        // 手机操作系统版本
        capabilities.setCapability("platformVersion","7.0");
        // 被测app 的包名
        capabilities.setCapability("appPackage","com.miui.calculator");
        // 被测app 启动类名
        capabilities.setCapability("appActivity",".cal.CalculatorActivity");
        // Android驱动程序，加载参数
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.findElement(By.name("1")).click();
        driver.findElement(By.name("2")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
        driver.findElement(By.name("8")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("com.miui.calculator:id/btn_c_s")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
