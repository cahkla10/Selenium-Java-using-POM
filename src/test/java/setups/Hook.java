package setups;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends DriverSetup{
    @Before
    public void before() throws Exception {
        startDriver();
    }

    @After
    public void after() throws Exception {
        stopDriver();
    }
}