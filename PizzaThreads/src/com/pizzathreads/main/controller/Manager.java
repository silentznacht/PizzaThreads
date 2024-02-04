package main.controller;

import main.menu.*;
import main.services.*;
import main.questions.*;
import main.account.signup.*;
import main.account.login.*;

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