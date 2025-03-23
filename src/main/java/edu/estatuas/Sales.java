package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class Sales implements Criteria {

    private List<Offer> salesList;

    Sales() {
        this.salesList = new ArrayList<>();
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Sale) {
                salesList.add(offer);
            }
        }return salesList;
    }
}
