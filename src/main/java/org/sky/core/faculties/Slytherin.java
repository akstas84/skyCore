package org.sky.core.faculties;

import org.sky.core.Hogwarts;

public class Slytherin extends Hogwarts {
    private int cunning = 1;
    private int determination = 1;
    private int ambition = 1;
    private int resourcefulness = 1;
    private int thirstPower = 1;

    public Slytherin(int cunning, int determination, int ambition, int resourcefulness, int thirstPower) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public void getBestSlytherinStudent(Slytherin firstGryffindorStudent) {
        int firstStudTotalPoints = firstGryffindorStudent.getCunning() + firstGryffindorStudent.getDetermination()
                + firstGryffindorStudent.getAmbition() + firstGryffindorStudent.getResourcefulness() + firstGryffindorStudent.getThirstPower();
        int secStudTotalPoints = this.getCunning() + this.getDetermination()
                + this.getAmbition() + this.getResourcefulness() + this.getThirstPower();

        String bestSt = (firstStudTotalPoints > secStudTotalPoints) ? firstGryffindorStudent.getName() : this.getName();
        System.out.println(bestSt + " лучший Слизериец");
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    @Override
    public String toString() {
        return super.toString() + " Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstPower=" + thirstPower +
                '}';
    }
}
