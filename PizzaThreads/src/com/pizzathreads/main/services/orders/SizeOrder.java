package main.services.orders;

import java.util.*;
import main.controller.Input;
import main.questions.FrankQ;

public class SizeOrder implements Runnable {
    // object i => scanner (str)

    private static void orderSize() {
        
        String uChoice = Input.userInput.nextLine();
        String [] questions = FrankQ.frankQ;

            
            
    }

    public static void main(String [] args) {
        orderSize();
    }

    @Override
    public void run() {
        orderSize();
    }

}