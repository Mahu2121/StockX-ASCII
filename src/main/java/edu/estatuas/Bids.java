package edu.estatuas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bids implements Criteria {

    private List<Offer> bids;


    Bids() {
        this.bids = new ArrayList<>();

    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        for (Offer offer : sneaker.offers()) {
            bids.add(offer);
        }
        return bids;
    }
}
