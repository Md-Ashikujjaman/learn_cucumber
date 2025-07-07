package step_defination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utilities.DriverSetup.closeBrowser;
import static utilities.DriverSetup.startBrowser;

public class Hooks {

    public static String browserName = System.getProperty("browser", "Chrome");

    @Before
    public void startDriver(){
        startBrowser(browserName);
    }

    @After
    public void closeDriver(Scenario scenario){
        closeBrowser(scenario);
    }
}
