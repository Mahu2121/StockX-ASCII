package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;
    private List<Offer> andCriteriaList;

    AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
        this.andCriteriaList = new ArrayList<>();
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        for (Offer offer : sneaker.offers()) {
            if (offer.getSize().equals(criteria)) {
                this.andCriteriaList.add(offer);
            }
            if (offer.value() == otherCriteria) {
                this.andCriteriaList.add(offer);
            }
        }return andCriteriaList;
    }
}
