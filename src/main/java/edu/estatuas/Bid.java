package edu.estatuas;

import java.util.List;

public class Bid implements Offer {
    private Integer bid;
    private String size;

    Bid(String size,Integer bid) {
        this.bid = bid;
        this.size = size;
    }

    private Integer getBid() {
    return bid;}

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public int value() {
        return bid;
    }

    @Override
    public String toString(){
        return "\t \t \s" + this.getSize() + "\t" + this.getBid() + "\n";
    }

}
