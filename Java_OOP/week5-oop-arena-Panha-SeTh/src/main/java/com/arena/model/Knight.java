package com.arena.model;


public class Knight extends Character {
    public Knight(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public int attack() {
        return getAttackPower();
    }
}