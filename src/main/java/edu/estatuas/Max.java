package edu.estatuas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Max implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;
    private List<Offer> maxBids;

    Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
        this.maxBids = new ArrayList<>();
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker){
        for(Offer offer : sneaker.offers()){
            if (this.criteria.checkCriteria(sneaker).contains(offer)
                    && otherCriteria.checkCriteria(sneaker).contains(offer)) {
                this.maxBids.add(offer);
                maxBids.sort(Comparator.comparingInt(Offer::value).reversed());
            }
        }return maxBids;
    }

}
