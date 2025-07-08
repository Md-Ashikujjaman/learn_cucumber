package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "invalidUserCredentials")
    public static Object invalidCredentials(){
        Object[][] data = {
                {"Ashikujjaman.md", "password", "Incorrect username or password entered. Please try again."},
                {"Username", "ashik2025", "Incorrect username or password entered. Please try again."},
                {"Username", "password", "Incorrect username or password entered. Please try again."}
        };
        return data;
    }
}
