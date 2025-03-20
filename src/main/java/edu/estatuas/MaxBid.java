
package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class MaxBid implements Criteria {

    private List<Offer> maximum;

    MaxBid(){
    maximum = new ArrayList<>();}


    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        for (Offer offer : sneaker.offers()) {
            if(offer instanceof Bid) {
                maximum.add(offer);
            }
        }return maximum;
    }

}

