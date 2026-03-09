package com.arena.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CharacterTest {

    // Since Character is abstract, we need a concrete subclass for testing
    static class TestCharacter extends Character {
        public TestCharacter(String name, int health, int attackPower) {
            super(name, health, attackPower);
        }
        @Override
        public int attack() {
            return super.getAttackPower();
        }
    }

    @Test
    void characterInitializationTest() {
        Character c = new TestCharacter("TestHero", 100, 20);
        assertEquals("TestHero", c.getName());
        assertEquals(100, c.getHealth());
        assertTrue(c.isAlive());
    }

    @Test
    void takeDamageReducesHealth() {
        Character c = new TestCharacter("TestHero", 100, 20);
        c.takeDamage(30);
        assertEquals(70, c.getHealth());
    }

    @Test
    void isAliveReturnsCorrectly() {
        Character c = new TestCharacter("TestHero", 50, 10);
        assertTrue(c.isAlive());
        c.takeDamage(50);
        assertFalse(c.isAlive());
    }
}
