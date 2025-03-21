package edu.estatuas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LastSale implements Criteria {
    private List<Offer> sales;

    LastSale(){
    this.sales= new ArrayList<>();
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        for (Offer offer : sneaker.offers()) {
            if (offer instanceof Sale) {
                this.sales.add(offer);
            }
            Collections.reverse(this.sales);
        }
        return sales;
    }


}
