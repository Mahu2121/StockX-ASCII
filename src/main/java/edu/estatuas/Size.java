package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class Size implements Criteria {

    private String size;
    private List<Offer> sizes;


    public Size(String size) {
        this.size = size;
        this.sizes = new ArrayList<>();
    }

    private String getSize() {
        return this.size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker){
        for (Offer offer : sneaker.offers()) {
            if (offer.getSize().equals(this.size)){
            this.sizes.add(offer);
            }
        } return this.sizes;
    }

    @Override
    public String toString() {
        return "" + getSize();
    }

}
