package edu.estatuas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AskTest {


    @Test
    public void askSizeTest() {
    Ask ask = new Ask("10", 300);
    assertEquals("10",ask.getSize());}

    @Test
    public void askValueTest() {
    Ask ask = new Ask("10", 300);
    assertEquals(300,ask.value());}

}
