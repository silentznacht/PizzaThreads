package main.questions;

public class FrankQ {
    //Questions 
    private static int questionCount;
    public static String [] frankQ = {
        "\nFrank: Alright bud, choose a size for your pizza",
        "\nFrank: Sorry bud, I don't think we serve that size here",
        "\nFrank: Alright bud, you chose your pizza topping. Now choose what toppings you'd like, all up to 3",
        "\nFrank: Sorry that ain't a topping we serve here bud"
    };

    public FrankQ (int qCount, String [] questionArr) {
            questionCount = qCount;
            frankQ = questionArr;
    }

}