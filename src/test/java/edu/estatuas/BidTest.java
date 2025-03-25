package edu.estatuas;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BidTest {

    @Test
    void testBidInitialization() {
        Bid bid = new Bid("10", 300);
        assertEquals("10", bid.getSize());
        assertEquals(300, bid.value());
    }

}