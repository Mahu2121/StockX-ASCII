package edu.estatuas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxBidTest {

    private Sneaker sneaker;

    @BeforeEach
    public void setup() {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void criteriaTest() {
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("10", 300));

        MaxBid bids = new MaxBid();
        List<Offer> filteredBids = bids.checkCriteria(sneaker);

        assertEquals("9.5",filteredBids.get(0).getSize());

        assertEquals(479,filteredBids.get(0).value());


    }
}



