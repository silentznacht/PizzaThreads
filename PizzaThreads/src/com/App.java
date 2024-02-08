
import java.util.*;
import main.controller.*;

public class App {
    private static Scanner appInput = new Scanner(System.in);
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
                                    (est 2024)
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
            
            //try {
                
                do {

                    System.out.println(intro);
                    int userChoice = appInput.nextInt();

                    switch (userChoice) {
                        case 1:
                            Manager.appLoginController();
                            appInput.close(); 
                            loopStart = true;
                            break;
                        
                        case 2:
                            Manager.appSignUpController();
                            appInput.close();
                            Input.userInput.close();
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
            // } catch (java.util.InputMismatchException e) {
            //     System.out.println("Err **SYS CRASH: MUST RESTART** : Enter a numeric choice from menu (1 - 3)");
            // } 
    }

    public static void main(String[] args) {
        appIntro();
    }
}