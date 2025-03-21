package edu.estatuas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinAsk implements Criteria {

    private List<Offer> minimum;

    MinAsk() {
    this.minimum = new ArrayList<>();
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Ask) {
                minimum.add(offer);
                minimum.sort(Comparator.comparingInt(Offer::value));
            }
        }
        return minimum;
    }
}
