package edu.estatuas;

public class Bid implements Offer {
    private int bid;
    private String size;

    Bid(String size,int bid) {
        this.bid = bid;
        this.size = size;
    }

    @Override
    public String getSize() {
        return size;
    }
    @Override
    public int getValue() {
        return bid;
    }


}
