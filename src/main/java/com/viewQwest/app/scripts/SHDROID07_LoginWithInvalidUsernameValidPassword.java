package com.viewQwest.app.scripts;

import com.viewQwest.app.context.UserLoginContext;
import com.viewQwest.app.documents.UserLoginDocument;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

public class SHDROID07_LoginWithInvalidUsernameValidPassword extends StartDriver{
    @Features("User Login")
    @Step("Login with invalid username and valid password")
    @Title("User Login Testing")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Give invalid username and valid password and click login button. User should not be able to login to the system")
    @Stories({"Login Testing"})
    @Test
    public void loginWithValidUsernameAndPassword() throws Exception {
        UserLoginContext context = new UserLoginContext();
        context.setUserName("invaliduser@mailinator.com");
        context.setPassword("test123#");

        UserLoginDocument userLoginDocument = new UserLoginDocument(context);
        byte[] screenshot = userLoginDocument.login();
        saveScreenshot(screenshot);
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
