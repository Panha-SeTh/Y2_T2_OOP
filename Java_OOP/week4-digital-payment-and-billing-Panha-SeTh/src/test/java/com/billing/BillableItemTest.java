package com.billing;

import org.junit.jupiter.api.Test;

import com.billing.model.*;

import static org.junit.jupiter.api.Assertions.*;

public class BillableItemTest {

    @Test
    void shouldThrowIfNameBlank() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DigitalProduct("", 100, 10);
        });
    }

    @Test
    void shouldThrowIfPriceNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DigitalProduct("File", -10, 5);
        });
    }

    @Test
    void physicalProductPriceShouldIncludeShipping() {
        PhysicalProduct p = new PhysicalProduct("Book", 100, 5);
        assertEquals(110, p.calculatePrice());
    }

    @Test
    void digitalProductPriceShouldEqualBasePrice() {
        DigitalProduct d = new DigitalProduct("Ebook", 200, 50);
        assertEquals(200, d.calculatePrice());
    }
}
