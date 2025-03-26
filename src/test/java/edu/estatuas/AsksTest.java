package edu.estatuas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AsksTest {
    private Sneaker sneaker;

    @BeforeEach
    public void setup() {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void criteriaTest() {
        sneaker.add(new Ask("13", 338));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Sale("9.5", 479));
        sneaker.add(new Bid("10", 300));


        Asks minimum = new Asks();
        List<Offer> filteredAsks= minimum.checkCriteria(sneaker);

        assertEquals(1, filteredAsks.size());

        assertEquals("13",filteredAsks.get(0).getSize());

        assertEquals(338,filteredAsks.get(0).value());


    }

}