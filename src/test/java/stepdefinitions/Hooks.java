package stepdefinitions;

import org.junit.After;
import org.junit.Before;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp(){

    }


    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
