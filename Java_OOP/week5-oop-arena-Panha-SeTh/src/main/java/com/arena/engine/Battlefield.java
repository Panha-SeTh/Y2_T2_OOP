package com.arena.engine;


import com.arena.model.Character;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Battlefield {
    private final List<Character> heroes;
    private final List<Character> monsters;
    private final Random random;

    public Battlefield(List<Character> heroes, List<Character> monsters, Random random) {
        this.heroes = heroes;
        this.monsters = monsters;
        this.random = random;
    }

    public void startBattle() {
        while (isTeamAlive(heroes) && isTeamAlive(monsters)) {
            List<Character> aliveHeroes = getAliveCharacters(heroes);
            List<Character> aliveMonsters = getAliveCharacters(monsters);

            List<Character> allAlive = new ArrayList<>();
            allAlive.addAll(aliveHeroes);
            allAlive.addAll(aliveMonsters);

            Character attacker = getRandomCharacter(allAlive);
            if (attacker == null) break;

            List<Character> targetTeam = aliveHeroes.contains(attacker) ? aliveMonsters : aliveHeroes;
            Character target = getRandomCharacter(targetTeam);
            if (target == null) break;

            int damage = attacker.attack();
            target.takeDamage(damage);

            System.out.println(attacker.getName() + " attacks " + target.getName() + " for " + damage + " damage!");
            System.out.println(target.getName() + " HP: " + target.getHealth());
            System.out.println();
        }

        System.out.println("=== BATTLE FINISHED ===");
        if (isTeamAlive(heroes)) {
            System.out.println("Heroes Win!");
        } else if (isTeamAlive(monsters)) {
            System.out.println("Monsters Win!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    private boolean isTeamAlive(List<Character> team) {
        for (Character c : team) {
            if (c.isAlive()) return true;
        }
        return false;
    }

    private List<Character> getAliveCharacters(List<Character> team) {
        List<Character> alive = new ArrayList<>();
        for (Character c : team) {
            if (c.isAlive()) alive.add(c);
        }
        return alive;
    }

    private Character getRandomCharacter(List<Character> aliveList) {
        if (aliveList.isEmpty()) return null;
        int index = random.nextInt(aliveList.size());
        return aliveList.get(index);
    }
}