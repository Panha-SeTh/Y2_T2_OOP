package com.arena.model;


public class Dragon extends Character {
    public Dragon(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public int attack() {
        int bonus = getHealth() / 10;
        return getAttackPower() + bonus;
    }
}