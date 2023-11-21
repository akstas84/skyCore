package org.sky.core;

public class Hogwarts {

    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(){
    }

    public Hogwarts(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    protected String name;

    public void comparesPowerMagicAndDistanceTransgression(Hogwarts firstHogwartsSt) {
        int firstPowerSt = firstHogwartsSt.getMagicPower() + firstHogwartsSt.getTransgressionDistance();
        int secPowerSt = this.getMagicPower() + this.getTransgressionDistance();
        String sdf = this.getClass().getName();
        if(firstPowerSt != secPowerSt){
            if(firstPowerSt > secPowerSt) {
                System.out.println(firstHogwartsSt.getName() + " обладает бОльшей мощностью магии, чем" + this.getName() + ". ");
            } else if (firstPowerSt < secPowerSt) {
                System.out.println(this.getName() + " обладает бОльшей мощностью магии, чем" + firstHogwartsSt.getName() + ". ");
            }
        }
    }

//    public void comparesPowerMagicAndDistanceTransgression(Hogwarts firstHogwartsSt, Hogwarts secHogwartsSt){
//        int firstPowerSt = firstHogwartsSt.getMagicPower() + firstHogwartsSt.getTransgressionDistance();
//        int secPowerSt = secHogwartsSt.getMagicPower() + secHogwartsSt.getTransgressionDistance();
//        if(firstPowerSt != secPowerSt){
//            if(firstPowerSt > secPowerSt) {
//                System.out.println(firstPowerSt + " обладает бОльшей мощностью магии, чем" + secPowerSt + ". ");
//            } else if (firstPowerSt < secPowerSt) {
//                System.out.println(secPowerSt + " обладает бОльшей мощностью магии, чем" + firstPowerSt + ". ");
//            }
//        }
//    }

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
