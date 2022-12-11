package testngPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametirzationEg {

    @Test()
    @Parameters({"env"})
    public void pTest(String name){
        System.out.println(name);

    }
}
