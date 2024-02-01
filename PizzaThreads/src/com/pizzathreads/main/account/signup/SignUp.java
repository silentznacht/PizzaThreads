package main.account.signup;

import java.util.*;
import main.controller.Input;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SignUp implements Runnable {

    // author: @silentznacht 

    private static Scanner signUpSc = Input.userInput;
    private static String [] organizationArr = {"gmail", "yahoo", "outlook"};
    private static String [] specialChars = {"()", "{}" , "[]", "|", "`", "¬", "¦", "!" ,"£", "$", "%", "^", "&", "*", "<", ">", ":", ";", "#", "~", "_", "-", "+", "=", "@"};
    
    static void setEmail(String emailToJson) {
        boolean validEmail = false;
        boolean nextMethod = false;
        String email;
        String userEmail;

        do {
            System.out.println("[ Email SignUp (Please Enter a Valid Email) ]: ");
            email = signUpSc.nextLine();

                for (String word : organizationArr) {
                    if (email.contains(word)) {
                       // System.out.println("Test: " + email);
                        validEmail = true;
                        nextMethod = true;
                        break;
                    } else {
                        System.out.println("[Err]: Invalid Email, Try Again");
                        break;
                    }
                } 
        } while (!validEmail);

        // if email created valid => will pass to the next sequence (create password) & username = email(inputted) to be passed later for json convert

            userEmail = email;
            if (nextMethod) setPw(userEmail, null);
    }

    static void setPw(String emailToJson, String pwToJson) { // must contain at least one unicode/special character (!, @, #, etc)
        boolean validPassword = false;
        boolean specialCharFound = false;
        boolean nextMethod2 = false;
        String password;
      

        do {
            System.out.println("[Create A Password (must contain a special character [!, @, #, $, etc])]: ");
            password = signUpSc.nextLine();

                for (String chars : specialChars) {
                    if (password.toLowerCase().contains(chars)) {
                        specialCharFound = true;
                        nextMethod2 = true;
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

        pwToJson = password;
        if (nextMethod2) jsonConvert(emailToJson, pwToJson);
    
    }   
    
    static void signUp() { // sign up
        /*
         *                              What to next?
           
            *  Find a way to workflow the signup sys, if email is valid will pass onto the pw method
            *  Then pass these inputs to json convert file
            *  Finally implement all this in run method thread
         
        */

        setEmail(null);
    }

    static void jsonConvert(String userEmail, String userPassword) { // converts new credentials to json data
        //SignUp signUp = new SignUp(userEmail, password) // email, password
        System.out.println("[UPDATE]: Json implement soon")
    }

    public static void main(String[] args) {
        signUp();
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
    
}