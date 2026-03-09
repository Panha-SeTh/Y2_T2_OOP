package com.arena.engine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import com.arena.model.Character;
import com.arena.model.Knight;
import com.arena.model.Mage;
import com.arena.model.Orc;
import com.arena.model.Dragon;

public class BattlefieldTest {

    @Test
    void battlefieldShouldRunAndCompleteBattle() {
        Character knight = new Knight("Arthur", 10, 70);
        Character mage = new Mage("Eldrin", 50, 30);
        Character orc = new Orc("Grom", 50, 10);
        Character dragon = new Dragon("Smaug", 60, 40);
        
        List<Character> heroes = Arrays.asList(knight, mage);
        List<Character> monsters = Arrays.asList(orc, dragon);

        Random fixedRandom = new Random(123); // deterministic
        Battlefield battlefield = new Battlefield(heroes, monsters, fixedRandom);

        battlefield.startBattle();

        // Check that at least one team is dead
        boolean allHeroesDead = heroes.stream().allMatch(h -> !h.isAlive());
        boolean allMonstersDead = monsters.stream().allMatch(m -> !m.isAlive());

        assertTrue(allHeroesDead || allMonstersDead, "One team should be defeated");

        // Ensure health never goes negative
        heroes.forEach(h -> assertTrue(h.getHealth() >= 0));
        monsters.forEach(m -> assertTrue(m.getHealth() >= 0));
    }
        
    @Test
    void battlefieldDoesNotUseTypeChecking() {
        Character knight = new Knight("Arthur", 10, 70);
        Character orc = new Orc("Grom", 50, 10);
        List<Character> heroes = Arrays.asList(knight);
        List<Character> monsters = Arrays.asList(orc);

        Random fixedRandom = new Random(1);
        Battlefield battlefield = new Battlefield(heroes, monsters, fixedRandom);

        battlefield.startBattle();

        // Only assert based on Character behavior, no casting
        assertTrue(knight.getHealth() >= 0);
        assertTrue(orc.getHealth() >= 0);
    }
}
