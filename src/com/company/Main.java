package com.company;

public class Main {

    public static void main(String[] args) {

Hero hero = new Hero() {
    @Override
    public String applySuperAbility(String superAbilityType) {
        return super.applySuperAbility(superAbilityType);
    }
};

        System.out.println(hero.applySuperAbility("Holy power"));

 /*       System.out.println(new Magic().applySuperAbility("Fire Ball"));
        System.out.println(new Medic().applySuperAbility("Healing"));
        System.out.println(new Warrior().applySuperAbility("Howl"));*/

HavingSuperAbility havingSuperAbility[] = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < havingSuperAbility.length; i++) {
           if (havingSuperAbility[i] instanceof Medic){
               System.out.println(new Medic().applySuperAbility("Healing"));

            }if (havingSuperAbility[i] instanceof Magic){
               System.out.println(new Magic().applySuperAbility("Fire ball"));

            }if (havingSuperAbility[i] instanceof Magic){
               System.out.println(new Warrior().applySuperAbility("Howl"));

            }

        }

    }
}