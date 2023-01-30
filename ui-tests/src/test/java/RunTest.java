import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"com.epam.jdi.bdd", "cucumberTests"},
        plugin = {"pretty", "io.qameta.allure.cucumberjvm.AllureCucumberJvm"},
        tags = "@LogInTest, @LogOutTest, @RegistrationTest, @ShoppingCartTest"
)


public class RunTest {
}



































