package SpeiPruebas;

        import org.testng.Assert;
        import org.testng.annotations.Test;

public class DependencyBetweenTestCases
{

    @Test
    public void startApp()
    {
        System.out.println("Starting app");
    }

    @Test(dependsOnMethods = "startApp")
    public void loginApp()
    {
        System.out.println("Login to app");
    }

    @Test(dependsOnMethods = "loginApp")
    public void logoutApp()
    {
        System.out.println("Logout app");

    }
}
