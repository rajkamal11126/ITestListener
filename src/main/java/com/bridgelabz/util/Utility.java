package com.bridgelabz.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class Utility {
    public static String capture(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("src/../BStackImages/" + System.currentTimeMillis() + ".png");
        String errata = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errata;
    }
}
