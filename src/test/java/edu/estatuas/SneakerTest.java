package edu.estatuas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SneakerTest {

    private Sneaker sneaker;



    @BeforeEach
    public void setup() {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void AddBidsTest() {

        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));

        assertEquals(5, sneaker.getOffersSize());
    }

    @Test
    void SetAndGetValuesTest() {
        sneaker.setBid(300);
        sneaker.setAsk(350);
        sneaker.setSale(280);

        assertEquals(300, sneaker.getBid());
        assertEquals(350, sneaker.getAsk());
        assertEquals(280, sneaker.getSale());
    }

}