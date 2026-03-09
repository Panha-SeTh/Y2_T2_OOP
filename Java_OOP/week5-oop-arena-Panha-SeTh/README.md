[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/Ag-5QBIz)
# OOP Arena – Polymorphic Battle Simulator

## Story

Welcome to JavaLand Arena.

Heroes and Monsters are fighting for control of the kingdom.
Each character has unique abilities, but the battlefield system does not know who is a hero or a monster.

It only knows one thing:
- Every fighter is a `Character`.

Your task is to design a console-based battle simulator using polymorphism.

## Learning Objectives
By completing this assignment, you must demonstrate:
- Inheritance
- Method overriding
- Runtime polymorphism
- Using List`<Character>` polymorphically
- Random battle interactions
- Clean OOP design
- Writing testable code
- No type-checking logic

## Required Architecture

You MUST follow this design structure.

### Abstract Superclass: Character

You must create an abstract class:

```java
public abstract class Character
```
**Required Fields:**
- `String name`: must not empty
- `int health`: must be positive
- `int attackPower`: must be greater than 0

**Required Methods:**
```java
public TestCharacter(String name, int health, int attackPower) // constructor
public abstract int attack();
public void takeDamage(int damage);
public boolean isAlive();
public String getName();
public int getHealth();
public int getAttackPower();
```
**Important:**
- `attack()` must return damage (int)
- Do NOT print inside `attack()`
- Keep logic testable
- Health must not be negative at all cost (handle it in `takeDamage` method).


### Hero Classes (At Least 2)

**Examples:**
- Knight
- Mage
- Archer

**Each hero must:**
- Extend `Character`
- Override `attack()`
- Have different behavior

**Example ideas:**
- `Knight` → normal damage
- `Mage` → bonus magic damage
- `Archer` → chance for critical hit


### Monster Classes (At Least 2)

**Examples:**
- Orc
- Dragon
- Goblin

**Each monster must:**
- Extend Character
- Override `attack()`

### Battlefield System

**Create a class:**

```java
public class Battlefield
```

**Fields:**
- `List<Character> `heroes
- `List<Character>` monsters
- `Random random`

**Constructor:**

Must receive all lists and Random as parameters.
```java
public Battlefield(List<Character> heroes,
                   List<Character> monsters,
                   Random random)
```
Do NOT create Random inside the class. It must be injected through constructor (for testing purposes).

**Required method:**
```java
public void startBattle();

```
**Note**: You can add any additional method to support `startBattle()` method. For instances: 
- `isTeamAlive(List<Character> team)`, 
- `getAliveCharacters(List<Character> team)`, 
- `getRandomCharacter(List<Character> aliveCharacters)`, 
- or `fight(Character attaker, Character target)`.

**Battle Rules**

1. While at least one hero AND one monster are alive:
    - Randomly choose an attacker
    - Randomly choose a target from the opposite team

2. Attacker deals damage using `attack()`
3. Target receives damage using `takeDamage()`
4. Both attackers and target must be alive to be randomly selected.
5. Print verbose battle logs

## Console Output (Verbose Logging Required)

Your program must clearly log each action.

**Example format:**

```
Knight Arthur attacks Dragon Smaug for 20 damage!
Smaug HP: 280

Dragon Smaug attacks Mage Eldrin for 60 damage!
Eldrin HP: 30
```

**At the end:**

```
=== BATTLE FINISHED ===
Heroes Win!
```


## Testability Requirements (Very Important)

Your code MUST be unit-test friendly.

**This means:**
- No input from Scanner inside logic
- No static random generator
- `attack()` returns `int`
- Logic separated from printing when possible

## Optional
Testing the logic and create a story line in `App.java` class. To see if all the characters can fight each other untill one team defeated.

## Happy Coding!