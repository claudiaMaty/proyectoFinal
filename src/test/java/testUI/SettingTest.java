package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import session.Session;

public class SettingTest {

    @BeforeEach
    public void goWebApp(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
    @AfterEach
    public void closeWebApp(){
        Session.getInstance().closeSession();
    }

    @Test
    public void verifySettingSuccess(){

    }
}

