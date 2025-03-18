package edu.estatuas;

public class Sneaker implements Item {
    private String name;
    private String style;
    private int sale;
    private int ask;
    private int bid;

    Sneaker(String name, String style) {
        this.name = name;
        this.style = style;


    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public int  getAsk(){
        return this.ask;
    }
    @Override
    public int getSale(){
        return this.sale;
    }
    @Override
    public String toString() {
        return style + "\n \t \t" + name;
    }
}
