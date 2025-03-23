package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class Bids implements Criteria {

    private List<Offer> bidsList;


    Bids() {
        this.bidsList = new ArrayList<>();

    }


    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        for (Offer offer : sneaker.offers()) {
            if(offer instanceof Bid) {
                this.bidsList.add(offer);
            }
        }return this.bidsList;
    }
}
