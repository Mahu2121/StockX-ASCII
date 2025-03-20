package edu.estatuas;

public class Ask implements Offer{
    private String size;
    private Integer ask;

    Ask(String size,Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public int value() {
        return this.ask;
    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "\t \t \s" + this.size + "\t" + this.ask + "\n";
    }

}
