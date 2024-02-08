package main.account.signup;

import java.io.File;
import java.io.IOException;
import java.util.*;
import main.controller.Input;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SignUp implements Runnable {

    // author: @silentznacht 

    private static Scanner signUpSc = Input.userInput;
    private static String [] organizationArr = {"gmail", "yahoo", "outlook"};
    private static String [] specialChars = {"()", "{}" , "[]", "|", "`", "¬", "¦", "!" ,"£", "$", "%", "^", "&", "*", "<", ">", ":", ";", "#", "~", "_", "-", "+", "=", "@"};
    
    private static String userEmail;
    private static String password;

    static void setEmail(String emailToJson) {
        boolean validEmail = false;
        boolean nextMethod = false;
        String email;
        //String userEmail;

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
        //String password;
    
        do {
            System.out.println("[Create A Password (must contain a special character [!, @, #, $, etc])]: ");
            password = signUpSc.nextLine();

            try {
                for (String chars : specialChars) {
                        if (password.toLowerCase().contains(chars)) {
                            specialCharFound = true;
                            nextMethod2 = true;
                            break;
                        } 
                    } 
                    // TODO: add try catch next for num err, then implement json process in json method
                    if (specialCharFound) {                 
                        validPassword = true;
                        break;
                    } else {
                       System.err.println("[Err]: Invalid Password, Try Again");
                    }
            } catch (java.util.InputMismatchException e) {System.err.println("[Err101]: Use of ints detected");}
        
        } while (!validPassword);

        pwToJson = password;
        if (nextMethod2) jsonConvert(emailToJson, pwToJson);

        // Debug info

            System.out.println("Email: " + emailToJson);
    
    }   
    
    static void signUp() { // sign up
        setEmail("");
    }

    static void jsonConvert(String emailToJson, String pwToJson) { // converts new credentials to json data
        // input values for debugging
        System.out.println("Email: " + emailToJson);
        System.out.println("Password: " + pwToJson);

        // Convert to JSON
        try {
            SignUp jsonData = new SignUp();
            jsonData.userEmail = emailToJson;
            jsonData.password = pwToJson;

            ObjectMapper objectMapper = new ObjectMapper();
            System.out.println("[UPDATE]: Json implemented successfully");
            objectMapper.writeValue(new File("output.json"), jsonData);
        } catch (IOException e) {
            System.err.println("[Err]: Error converting to JSON: " + e.getMessage());
        }
    }

    @Override
    public void run() {
        signUp();
    }
    
}