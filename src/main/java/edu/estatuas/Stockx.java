package edu.estatuas;

public class Stockx {
    private Item sneaker;

    Stockx(Item sneaker) {
        this.sneaker = sneaker;
    }


    public static String draw(Item sneaker) {
        return
                "\n\n\t\t" + sneaker.getAsk() + " Buy\t"
                        + sneaker.getBid() + " Sell \n" +
                        "\t\t" + " _    _" + "\n" +
                        "\t\t" + "(_\\__/(,_" + "\n" +
                        "\t\t" + "| \\ `_////-._" + "\n" +
                        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
                        "\t\t" + "|=====;__/___./" + "\n" +
                        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +
                        "\t" + sneaker + "\n" +
                        "\t\tlast sale: " + sneaker.getSale();
    }
}
