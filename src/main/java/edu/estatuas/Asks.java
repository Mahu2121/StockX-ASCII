package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class Asks implements Criteria{
    private List<Offer> asks;

    Asks() {
        this.asks = new ArrayList<>();
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
            for (Offer offer : sneaker.offers()) {
                if(offer instanceof Ask) {
                    asks.add(offer);
                }
            }return asks;
    }
}
