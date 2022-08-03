package com.niit.jdp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SellingPriceTest {
    private String[] lines;

    @BeforeEach
    void setUp() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        SellingPrice.main(new String[]{});
        String output = outputStreamCaptor.toString().trim();
        lines = output.split("\n");
    }

    @Test
    @DisplayName("The name of the class should be exactly `EnquiryForm`.")
    @Order(1)
    void testClassName() {
        SellingPrice sellingPrice = new SellingPrice();
        assertEquals("SellingPrice", sellingPrice.getClass().getSimpleName(),
                "The name of the class should be exactly `SellingPrice`.");
    }

    @Test
    @DisplayName("The output should exactly match as given in README.md.")
    @Order(2)
    void shouldGiveExactOutput() {
        String expected = "Revised Selling Price for Rounded Kaisa Bowl is $11.5395";
        assertEquals(expected, lines[0], "The output should exactly match as given in README.md.");
    }
}