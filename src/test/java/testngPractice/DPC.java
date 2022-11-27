package testngPractice;

import org.testng.annotations.DataProvider;

public class DPC {
    @DataProvider(name="testData", parallel = true)
    public Object[][] getData(){
        return new String[][]{{"testone", "23"},{"testtwo", "24"},{"testthree", "25"}};
    }
}
