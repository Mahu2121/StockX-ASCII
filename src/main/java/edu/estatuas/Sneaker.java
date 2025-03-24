package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    private final String name;
    private final String style;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers;

    Sneaker(String name, String style) {
        this.name = name;
        this.style = style;
        this.offers = new ArrayList<>();
    }

    public int getOffersSize(){
    return offers.size();}

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public String toString() {
        return style + "\n \t \t" + name;
    }

    @Override
    public void add(Offer offer) {
        if (offer != null)
            this.offers.add(offer);
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }
}
