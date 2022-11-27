package testngPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideEg {

    @Test(dataProvider = "testData",dataProviderClass = DPC.class)
    public void dTest(String name, String age){
        System.out.println(name + age);
    }


}
