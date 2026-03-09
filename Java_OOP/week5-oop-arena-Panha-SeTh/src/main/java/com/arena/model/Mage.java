package com.arena.model;


public class Mage extends Character {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public int attack() {
        return getAttackPower() + 5;
    }
}