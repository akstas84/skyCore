package org.sky.core.faculties;

import org.sky.core.Hogwarts;

public class Gryffindor extends Hogwarts {

    private int nobility = 1;
    private int honor = 1;
    private int bravery = 1;

    public Gryffindor() {
    }

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void getBestGryffindorStudent(Gryffindor firstGryffindorStudent) {
        int firstStudTotalPoints = firstGryffindorStudent.getBravery() + firstGryffindorStudent.getNobility() + firstGryffindorStudent.getHonor();
        int secStudTotalPoints = this.getBravery() + this.getNobility() + this.getHonor();

        String bestSt = (firstStudTotalPoints > secStudTotalPoints) ? firstGryffindorStudent.getName() : this.getName();
        System.out.println(bestSt + " лучший Гриффиндорец");
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
