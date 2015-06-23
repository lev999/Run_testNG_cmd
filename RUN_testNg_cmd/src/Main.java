

import org.testng.Assert;
import org.testng.annotations.Test;

//http://stackoverflow.com/questions/7100821/suddenly-cant-run-testng-tests-from-ant-testng-caused-by-java-lang-classnot
//http://www.tutorialspoint.com/testng/testng_executing_tests.htm

// to standart testng-6.8.21.jar need to add jcommander-1.7.jar!


// to run in cmd: java -cp run.Main
// java - cp "./path fo .class;./path to lib" run.Main


//-------------to run TEST ----------
//java org.testng.TestNG %ProjectPath%\testng.xml
//
//        set projectPath=F:\Lev_PRIVATE_data\JAVA_projects\REAL_PROJECT\QA\Genefo\target\MyTest
//        set classpath=%Projectpath%\bin\*;%ProjectPath%\lib\*
//
//        set classpath=F:\Lev_PRIVATE_data\JAVA_projects\REAL_PROJECT\QA\kill\untitled
//        java -cp ".;F:\Lev_PRIVATE_data\JAVA_projects\REAL_PROJECT\QA\kill\untitled\testng-6.8.21.jar" org.testng.TestNG testng.xml
//-------------------------------------------------
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! 22");
//        org.testng.TestNG.main(new String[]{"testng.xml"});
    }
    @Test
    public void myTest(){
        Assert.assertTrue(true);
    }


}
