package myPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

//java -cp "./target;." myPackage.Main2
//java -cp ".;F:\Lev_PRIVATE_data\JAVA_projects\REAL_PROJECT\QA\kill\RUN_testNg_cmd\target\testng-6.8.21.jar" org.testng.TestNG testng_runMain2.xml

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello world! Main2");
    }
    @Test
    public void myTest(){
        Assert.assertTrue(!true,"Assert in class myPackage.Main2");
    }

}
