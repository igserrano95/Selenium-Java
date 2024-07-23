package Pages;



public class LoginPage extends BasePage {

    private String userName = "user-name";
    private String password = "password";
    private String loginButton = "login-button";
    


    public LoginPage(){
        super(driver);
    }

    public void navigateToSauceDemo(){
        navigateTo("https://www.saucedemo.com/");
    }

    public void writeUserName(){
        writeElement(userName, "standard_user");
    }

    public void writePassword(){
        writeElement(password, "secret_sauce");
    }

    public void clickLoginButton(){
        clickElement(loginButton);
    }

    public String getTitle() {
        return driver.getTitle();
    }




}

