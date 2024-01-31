
import main.controller.*;
import java.util.*;

public class App {

    private static Scanner appInput = Input.userInput;

    static void appTitle() {
        
            String title = """
                ╔═══════════════════════════════════════════════════════╗
                ║   _____ _           _______ _                        _║
                ║  |  __ (_)         |__   __| |                      | ║
                ║  | |__) | __________ _| |  | |__  _ __ ___  __ _  __| ║
                ║  |  ___/ |_  /_  / _` | |  | '_ \\| '__/ _ \\/ _` |/ _║
                ║  | |   | |/ / / / (_| | |  | | | | | |  __/ (_| | (_| ║
                ║  |_|   |_/___/___\\__,_|_|  |_| |_|_|  \\___|\\__,_|\\║
                ╚═══════════════════════════════════════════════════════╝                          
                -
                """;

            System.out.print(title);

    }

    static void appIntro() { // Login or SignUP
        appTitle();
                
        boolean loopStart = false;
        String intro = 
            """
                            [Pizza Threads] 

                    1. Login
                    2. SignUp
                    3. Exit
                
                [Enter Choice Here]: 

            """;
            
            do {
                System.out.println(intro);
                int userChoice = appInput.nextInt();

                switch (userChoice) {
                    case 1:
                        Manager.appLoginController();
                        loopStart = true;
                        break;
                    
                    case 2:
                        Manager.appSignUpController();
                        loopStart = true;
                        break;

                    case 3:
                        System.exit(0);
                        loopStart = false;
                        break;
                
                    default:
                        System.err.println(intro);
                        break;
                }
            } while (!loopStart);
    }

    public static void main(String[] args) {
        appIntro();
    }
}