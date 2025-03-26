package edu.estatuas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AndCriteriaTest {

    private Sneaker sneaker;

    @BeforeEach
    public void setup() {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void andCriteriaBidsTest() {
        sneaker.add(new Ask("13", 338));
        sneaker.add(new Bid("3", 200));
        sneaker.add(new Sale("9.5", 479));
        sneaker.add(new Bid("10", 300));
        sneaker.add(new Bid("10", 200));


        Bids bids = new Bids();
        Size size = new Size("10");

        AndCriteria offers = new AndCriteria(size, bids);
        List<Offer> filteredBids = offers.checkCriteria(sneaker);

        assertEquals(2, filteredBids.size());

        assertEquals("10",filteredBids.get(0).getSize());
        assertEquals("10",filteredBids.get(1).getSize());


        assertEquals(300,filteredBids.get(0).value());
        assertEquals(200,filteredBids.get(1).value());


    }

    @Test
    public void andCriteriaAsksTest() {
        sneaker.add(new Ask("13", 338));
        sneaker.add(new Bid("3", 200));
        sneaker.add(new Sale("9.5", 479));
        sneaker.add(new Ask("13", 300));
        sneaker.add(new Ask("10", 200));


        Asks asks = new Asks();
        Size size = new Size("13");

        AndCriteria offers = new AndCriteria(size, asks);
        List<Offer> filteredAsks = offers.checkCriteria(sneaker);

        assertEquals(2, filteredAsks.size());

        assertEquals("13",filteredAsks.get(0).getSize());
        assertEquals("13",filteredAsks.get(1).getSize());


        assertEquals(338,filteredAsks.get(0).value());
        assertEquals(300,filteredAsks.get(1).value());


    }
}


