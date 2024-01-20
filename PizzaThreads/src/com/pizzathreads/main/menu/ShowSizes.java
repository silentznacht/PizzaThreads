package main.menu;

import main.menu.prices.Sizes;

public class ShowSizes { 

    private static int [] sizePriceArr = Sizes.sizePrice;
    private static String [] sizeName = Sizes.sizeArr;
    
    static void sizesDisplay() { // displays user sizes
        System.out.println("            [Sizes]");
            for (int i = 0; i < sizeName.length; i++) {
                System.out.println(sizeName[i] + ": " + sizePriceArr[i]);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}