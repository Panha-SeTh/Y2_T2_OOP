package com.arena.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void dragonAttackTest() {
        Dragon dragon = new Dragon("Smaug", 60, 40);
        int damage = dragon.attack();
        assertTrue(damage > 0);
    }

    @Test
    void dragonHealthAfterDamage() {
        Dragon dragon = new Dragon("Smaug", 60, 40);
        int initialHealth = dragon.getHealth();
        dragon.takeDamage(50);
        assertEquals(initialHealth - 50, dragon.getHealth());
    }
}
