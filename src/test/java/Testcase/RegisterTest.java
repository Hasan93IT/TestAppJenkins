package Testcase;

import HelfMethoden.ExceptionExistence;
import HelfMethoden.ExceptionInput;
import HelfMethoden.TestNGListener;
import Pages.RegisterPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(TestNGListener.class)
public class RegisterTest extends TestBase {

    RegisterPage Register1;

    @Test public void RegisterTest1() throws ExceptionInput, ExceptionExistence, IOException {
        Register1 = new RegisterPage(driver);
        Register1.Register();
    }
}
