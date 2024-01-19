package main.menu.prices;


public class Sizes {

    public static int smallPie = 5;
    public static int medPie = 10;
    public static int largePie = 15;

    public static String [] sizeArr = {"Small", "Medium", "Large"};
    public static int [] sizePrice = {smallPie, medPie, largePie};

        public Sizes(int smallPie, int medPie, int largePie) {
                Sizes.smallPie = smallPie;
                Sizes.medPie = medPie;
                Sizes.largePie = largePie;
        }
}