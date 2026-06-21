package com.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void testStringNotNull() {
        String name = "JUnit";
        assertNotNull(name);
    }

    @Test
    public void testBooleanTrue() {
        assertTrue(10 > 5);
    }
}