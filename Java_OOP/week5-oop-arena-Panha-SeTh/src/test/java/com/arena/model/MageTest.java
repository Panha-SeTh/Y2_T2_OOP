package com.arena.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MageTest {

    @Test
    void mageAttackTest() {
        Mage mage = new Mage("Eldrin", 50, 30);
        int damage = mage.attack();
        assertTrue(damage > 0);
    }

    @Test
    void mageHealthAfterDamage() {
        Mage mage = new Mage("Eldrin", 50, 30);
        mage.takeDamage(60);
        assertEquals(0, mage.getHealth());
    }
}
