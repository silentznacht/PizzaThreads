package main.menu;


import java.util.*;
import main.controller.*;

public class Menu implements Runnable { 
	static Thread thread;
	static Scanner inputSc = Input.userInput;

	private static void startMenu(boolean menuLoop) {
		    System.out.println
                (
                        """
                                            [Frank's Pizza]

                                1. Order Pizza 
                                2. Check Our Menu
                                3. Leave
                            
                        """ 
                );

			String menuInput = inputSc.nextLine();

				try {
					while (!menuLoop) {
						switch(menuInput) {
							case "1":
							// Order pizza sequence here
								menuLoop = true;
								break;
							case "2":
							// Displays menu
								Display.displayMenu();
								startMenu(menuLoop); // recursion 
							case "3":
							// Exits Program
								menuLoop = true;
								System.exit(0);
								break;
						}

						// super-secret cheat & game
						if (menuInput.toLowerCase().equalsIgnoreCase("AshenStar")) {

						}
					}
				} catch (java.util.InputMismatchException e) {
					// handles exception & invalid ints passed such as strs & chars
					System.out.println("Err: Invalid input. Please enter a string.");
				} 
			
	}

	public static void main(String[] args) {
		startMenu(false);
	}
	@Override
	public void run() {
		startMenu(false);
	}


}
