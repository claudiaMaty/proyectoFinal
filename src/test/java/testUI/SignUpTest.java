package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.MainPage;
import page.MenuSection;
import page.SignUpModal;
import session.Session;
import java.util.Random;

public class SignUpTest {
    MainPage mainPage = new MainPage();
    SignUpModal loginModal = new SignUpModal();
    MenuSection menuSection= new MenuSection();

    @BeforeEach
    public void goWebApp(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }
    @AfterEach
    public void closeWebApp(){
        Session.getInstance().closeSession();
    }

    @Test
    public void verifyLoginIsSuccessfully(){
        mainPage.loginButton.click();
        loginModal.fullNameTxtBox.writeText("claudia6");
        loginModal.emailTxtBox.writeText("claudia6@hotmail.com");
        loginModal.pwdTxtBox.writeText("1234");
        loginModal.selectCheck.click();
        loginModal.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR el login fallo");

    }
}
