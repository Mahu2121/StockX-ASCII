package edu.estatuas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesTest {
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


        Sales sales = new Sales();
        List<Offer> filteredSales = sales.checkCriteria(sneaker);

        assertEquals(1, filteredSales.size());

        assertEquals("9.5",filteredSales.get(0).getSize());

        assertEquals(479,filteredSales.get(0).value());


    }
}
