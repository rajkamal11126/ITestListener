package test;

import com.bridgelabz.base.Base;
import com.bridgelabz.listener.ListenerTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)

public class TestCases extends Base {
    //Test to pass as to verify listeners.
    @Test
    public void Login() {
        driver.findElement(By.name("uid")).sendKeys("kamal34926");
        driver.findElement(By.name("password")).sendKeys("kamalraj");
        // driver.findElement(By.id("")).click();
    }

    //Forcefully failed this test as verify listener.
    @Test
    public void TestToFail() {
        System.out.println("This method to test fail");
        Assert.assertTrue(true);
    }
}
