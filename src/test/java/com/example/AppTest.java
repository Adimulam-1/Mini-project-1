package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddition() {
        assertEquals(15, App.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, App.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, App.multiply(10, 5));
    }
}
