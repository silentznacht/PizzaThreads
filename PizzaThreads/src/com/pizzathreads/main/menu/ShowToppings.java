package main.menu;

import main.menu.prices.Toppings;

public class ShowToppings {

    private static double [] toppingsPriceArr = Toppings.toppingsPriceArr;
    private static String [] toppingNames = Toppings.toppingsArr;

        
    static void toppingsDisplay() { // displays user sizes
        System.out.println("            (Pizza Toppings)");
            for (int i = 0; i < toppingNames.length; i++) {
                System.out.println(toppingNames[i] + ": " + toppingsPriceArr[i]);
                try {
                    Thread.sleep(350);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    public static void main(String [] args) {
        toppingsDisplay();
    }
}