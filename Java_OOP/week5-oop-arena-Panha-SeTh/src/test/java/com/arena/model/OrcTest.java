package com.arena.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrcTest {

    @Test
    void orcAttackTest() {
        Orc orc = new Orc("Grom");
        int damage = orc.attack();
        assertTrue(damage > 0);
    }

    @Test
    void orcHealthAfterDamage() {
        Orc orc = new Orc("Grom");
        int initialHealth = orc.getHealth();
        orc.takeDamage(25);
        assertEquals(initialHealth - 25, orc.getHealth());
    }
}
