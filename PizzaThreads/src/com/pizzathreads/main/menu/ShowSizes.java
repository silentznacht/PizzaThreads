package main.menu;

import main.menu.prices.Sizes;

public class ShowSizes { 

    private static int [] sizePriceArr = Sizes.sizePrice;
    private static String [] sizeName = Sizes.sizeArr;
    
    static void sizesDisplay() { // displays user sizes
        System.out.println("            (Pizza Sizes)");
        int sizeShownCount = 0;
        for (int i = 0; i < sizeName.length; i++) {
                sizeShownCount ++;
                System.out.println(sizeShownCount + ". " + sizeName[i] + ": " + sizePriceArr[i]);
                try {
                    Thread.sleep(350);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }  
            System.out.flush(); // Flush the output
    }
 
    public static void main (String [] args) {
        sizesDisplay();
    }
}
 