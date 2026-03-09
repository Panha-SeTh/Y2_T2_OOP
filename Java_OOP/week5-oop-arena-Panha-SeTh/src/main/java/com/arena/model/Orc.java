package com.arena.model;

public class Orc extends Character {
    public Orc(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public Orc(String name) {
        this(name, 100, 20);
    }

    @Override
    public int attack() {
        int bonus = (100 - getHealth()) / 10;  
        return getAttackPower() + bonus;
    }
}
