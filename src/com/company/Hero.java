package com.company;

public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Hero's ability: " + superAbilityType;
    }
}

