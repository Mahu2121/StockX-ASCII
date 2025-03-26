package edu.estatuas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SaleTest {


    @Test
    public void saleValueTest() {
        Sale sale = new Sale("10", 200);
        assertEquals(200, sale.value());
    }

    @Test
    public void seleSizeTest() {
        Sale sale = new Sale("10", 300);
        assertEquals("10",sale.getSize());
    }

}
