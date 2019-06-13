import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test1 {


    @Test
    public void StartWebDriver() {


        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.toolsqa.com/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.xpath("(//span[contains(text(),'DEMO SITES')])[1]"))).moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Automation Practice Form')])[1]"))).click().perform();
        driver.findElement(By.xpath("//strong[contains(text(),'First name:')]//following-sibling::input")).sendKeys("Przemek");
        driver.findElement(By.xpath("//strong[contains(text(),'Last name:')]//following-sibling::input")).sendKeys("Gierun");
        if ( !driver.findElement(By.id("sex-0")).isSelected() )
        {
            driver.findElement(By.id("sex-0")).click();
        }
        if ( !driver.findElement(By.id("exp-0")).isSelected() )
        {
            driver.findElement(By.id("exp-0")).click();
        }
        driver.findElement(By.id("datepicker")).sendKeys("18031987");
        if ( !driver.findElement(By.id("profession-0")).isSelected() )
        {
            driver.findElement(By.id("profession-0")).click();
        }
        if ( !driver.findElement(By.id("profession-1")).isSelected() )
        {
            driver.findElement(By.id("profession-1")).click();
        }
        if ( !driver.findElement(By.id("tool-1")).isSelected() )
        {
            driver.findElement(By.id("tool-1")).click();
        }
        if ( !driver.findElement(By.id("tool-2")).isSelected() )
        {
            driver.findElement(By.id("tool-2")).click();
        }
        Select dropdown = new Select(driver.findElement(By.id("continents")));
        dropdown.selectByVisibleText("Europe");
        driver.findElement(By.id("submit")).click();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();

    }
}
