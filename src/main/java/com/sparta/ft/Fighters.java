package com.sparta.ft;

import java.util.Arrays;

public enum Fighters {

    BARBARIAN(80, 100, 15),
    MAGE(10, 75, 40),
    ARCHER(25, 50, 90),
    CAVALRY(75, 80, 100),
    HEALER(5, 150, 80);

    private int strength;
    private int health;
    private int agility;

    Fighters(int strength, int health, int agility) {
        this.strength = strength;
        this.health = health;
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public static void main(String[] args) {

        Fighters barbarian = Fighters.BARBARIAN;
        Fighters mage = Fighters.MAGE;
        Fighters archer = Fighters.ARCHER;
        Fighters cavalry = Fighters.CAVALRY;
        Fighters healer = Fighters.HEALER;

        System.out.println(barbarian.name());
        System.out.println(mage.ordinal());
        System.out.println(archer.compareTo(barbarian));
        System.out.println(Arrays.toString(Fighters.values()));
        System.out.println(Fighters.valueOf("HEALER"));

        System.out.println(barbarian.getStrength());

    }

}
