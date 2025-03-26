package edu.estatuas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinAskTest {

    private Sneaker sneaker;

    @BeforeEach
    public void setup() {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void criteriaTest() {
        sneaker.add(new Ask("13", 338));
        sneaker.add(new Ask("6", 200));
        sneaker.add(new Ask("9.5", 479));
        sneaker.add(new Ask("10", 300));

        MinAsk asks = new MinAsk();
        List<Offer> filteredSales = asks.checkCriteria(sneaker);

        assertEquals("6",filteredSales.get(0).getSize());

        assertEquals(200,filteredSales.get(0).value());


    }
}


