package org.sky.core.faculties;

import org.sky.core.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private int smart = 1;
    private int wise = 1;
    private int witty = 1;
    private int creative = 1;

    public Ravenclaw(int smart, int wise, int witty, int creative) {
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public void getBestRavenclawStudent(Ravenclaw firstGryffindorStudent, Ravenclaw secGryffindorStudent) {
        int firstStudTotalPoints = firstGryffindorStudent.getSmart() + firstGryffindorStudent.getWise()
                + firstGryffindorStudent.getWitty() + firstGryffindorStudent.getCreative();
        int secStudTotalPoints = secGryffindorStudent.getSmart() + secGryffindorStudent.getWise()
                + secGryffindorStudent.getWitty() + secGryffindorStudent.getCreative();

        String bestSt = (firstStudTotalPoints > secStudTotalPoints) ? firstGryffindorStudent.getName() : secGryffindorStudent.getName();
        System.out.println(bestSt + " лучший Когтевранец");
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    @Override
    public String toString() {
        return super.toString() + " Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                '}';
    }
}
