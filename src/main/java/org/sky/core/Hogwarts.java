package org.sky.core;

public class Hogwarts {

    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(){
    }

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void comparesPowerMagicAndDistanceTransgression(Hogwarts firstHogwartsSt) {
        int firstPowerSt = firstHogwartsSt.getMagicPower() + firstHogwartsSt.getTransgressionDistance();
        int secPowerSt = this.getMagicPower() + this.getTransgressionDistance();
        if(firstPowerSt != secPowerSt){
            if(firstPowerSt > secPowerSt) {
                System.out.println(firstHogwartsSt.getName() + " обладает большей мощностью магии, чем" + this.getName() + ". ");
            } else if (firstPowerSt < secPowerSt) {
                System.out.println(this.getName() + " обладает большей мощностью магии, чем" + firstHogwartsSt.getName() + ". ");
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "\nМощность: " + magicPower + "\nТрансгрессирование :" + transgressionDistance;
    }
}
