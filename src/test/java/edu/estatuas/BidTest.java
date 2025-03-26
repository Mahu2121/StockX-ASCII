package edu.estatuas;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BidTest {

    @Test
    void bidInitializationTest() {
        Bid bid = new Bid("10", 300);
        assertEquals("10", bid.getSize());
        assertEquals(300, bid.value());
    }

}