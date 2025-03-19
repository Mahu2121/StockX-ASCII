package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class Asks implements Criteria{

    private List<Offer> values;

    Asks() {
        this.values = new ArrayList<>();
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        for (Offer offer : sneaker.offers()) {
            values.add(offer);
        }
        return values;
    }
}
