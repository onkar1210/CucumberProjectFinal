package MyHooks;

import io.cucumber.java.*;

public class AmazonHooks {
    @Before (order = 1) //Execute before every scenario
    public void setup_browser(Scenario sc){
        System.out.println(sc.getName());
        System.out.println("Launch browser");
    }

    @Before (order = 2)//Execute before every scenario
    public void setup_url(){
        System.out.println("Launch amazon url");
    }

    @After (order = 2)//Execute after every scenario
    public void close_browser(){
        System.out.println("close browser");
    }

    @After (order = 1)//Execute after every scenario
    public void logout(){
        System.out.println("logout amazon application");
    }

    @AfterStep("@Smoke")
    public void takeScreenshot(){ System.out.println("Screenshot Taken");}

    @BeforeStep("@Smoke")
    public void takeScreenshotBefore(){ System.out.println("ScreenshotBefore Taken");}
}
