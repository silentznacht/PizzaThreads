package controller;

import menu.*;
import services.*;
import questions.*;
import account.login.*;
import account.signup.*;

public class Manager {

    static SignUp signup = new SignUp();
    static Login login = new Login();
    
    // App 
    public static void appLoginController() {
        System.out.println("LoginTest: Your In");
    }

    public static void appSignUpController() {
        signup.run();
    }

} 