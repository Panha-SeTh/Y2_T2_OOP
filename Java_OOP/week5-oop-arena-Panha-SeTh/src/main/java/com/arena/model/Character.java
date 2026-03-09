package com.arena.model;


public abstract class Character {
    private final String name;
    private int health;
    private final int attackPower;

    public Character(String name, int health, int attackPower) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        if (health <= 0) {
            throw new IllegalArgumentException("Health must be positive");
        }
        if (attackPower <= 0) {
            throw new IllegalArgumentException("Attack power must be > 0");
        }
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract int attack();

    public void takeDamage(int damage) {
        if (damage < 0) return;
        health -= damage;
        if (health < 0) health = 0;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }
}