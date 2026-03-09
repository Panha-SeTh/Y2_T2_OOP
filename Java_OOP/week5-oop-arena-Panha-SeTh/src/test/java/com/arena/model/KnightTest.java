package com.arena.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class KnightTest {

    @Test
    void knightAttackTest() {
        Knight knight = new Knight("Arthur", 10, 70);
        int damage = knight.attack();
        assertTrue(damage > 0);
    }

    @Test
    void knightHealthAndDamage() {
        Knight knight = new Knight("Arthur", 10, 70);
        knight.takeDamage(20);
        assertEquals(0, knight.getHealth());
    }
}
