package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class QuadBrowserHeadless {
    public static void main(String[] args) {
        String url = "https://github.com/jatinrana331gm";

        for (int i = 1; i <= 4; i++) {
            final int id = i;
            new Thread(() -> {
                WebDriver driver = null;
                try {
                    if (id <= 2) {
                        // Chrome Headless Setup
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments("--headless=new"); 
                        driver = new ChromeDriver(chromeOptions);
                    } else {
                        // Edge Headless Setup
                        EdgeOptions edgeOptions = new EdgeOptions();
                        edgeOptions.addArguments("--headless");
                        driver = new EdgeDriver(edgeOptions);
                    }

                    driver.get(url);
                    System.out.println("Browser " + id + " started in background...");

                    for (int j = 1; j <= 50; j++) {
                        driver.navigate().refresh();
                        System.out.println("Browser " + id + " | Hidden Refresh: " + j);
                        Thread.sleep(3000); 
                    }
                } catch (Exception e) {
                    System.out.println("Browser " + id + " error: " + e.getMessage());
                } finally {
                    if (driver != null) {
                        driver.quit();
                    }
                }
            }).start();
        }
    }
}