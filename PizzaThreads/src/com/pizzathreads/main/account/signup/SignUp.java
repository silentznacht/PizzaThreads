package main.account.signup;

import java.util.*;
import main.controller.Input;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SignUp implements Runnable {

    // author: @silentznacht 

    private static Scanner signUpSc = Input.userInput;
    private static String [] organizationArr = {"gmail", "yahoo", "outlook"};
    private static String [] specialChars = {"()", "{}" , "[]", "|", "`", "¬", "¦", "!" ,"£", "$", "%", "^", "&", "*", "<", ">", ":", ";", "#", "~", "_", "-", "+", "=", "@"};
    
    static void setEmail() {
        boolean validEmail = false;
        String email;
        String userEmail;
        do {
            System.out.println("[Email SignUp (Please Enter a Valid Email)]: ");
            email = signUpSc.nextLine();

                for (String word : organizationArr) {
                    if (email.contains(word)) {
                        System.out.println("Test: " + word);
                        break;
                    } else {
                        System.out.println("[Err]: Invalid Email, Try Again");
                    }
                } validEmail = true;
        } while (!validEmail);

        userEmail = email;
        
        System.out.println(userEmail);
    }

    static void setPw() { // must contain at least one unicode/special character (!, @, #, etc)
        boolean validPassword = false;
        boolean specialCharFound = false;
        String password;
        String userPassword;

        do {
            System.out.println("[Create A Password (must contain a special character [!, @, #, $, etc])]: ");
            password = signUpSc.nextLine();

                for (String chars : specialChars) {
                    if (password.toLowerCase().contains(chars)) {
                        specialCharFound = true;
                        break;
                    } 
                } 

                if (specialCharFound) {
                    System.out.println("Password: " + password);
                    validPassword = true;
                    break;
                } else {
                    System.err.println("[Err]: Invalid Password, Try Again");
                }
        } while (!validPassword);

        userPassword = password;
        //System.out.println("Password: " + userPassword);
    }   
    
    static void signUp() { // sign up
        setEmail();
        setPw();
    }

    static void jsonConvert(String userEmail, String userPassword) { // converts new credentials to json data
        //SignUp signUp = new SignUp(userEmail, password) // email, password

    }

    public static void main(String[] args) {
        signUp();
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
    
}