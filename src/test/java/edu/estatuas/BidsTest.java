package edu.estatuas;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BidsTest {

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


        Bids bids = new Bids();
        List<Offer> filteredBids = bids.checkCriteria(sneaker);

        assertEquals(2, filteredBids.size());

        assertEquals("6",filteredBids.get(0).getSize());
        assertEquals("10",filteredBids.get(1).getSize());

        assertEquals(200,filteredBids.get(0).value());
        assertEquals(300,filteredBids.get(1).value());

    }

}
