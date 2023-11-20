package org.sky.core.faculties;

import org.sky.core.Hogwarts;

public class Hufflepuff extends Hogwarts {

    private int hardworking = 1;
    private int loyal = 1;
    private int honest = 1;

    public Hufflepuff(int hardworking, int loyal, int honest) {
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void getBestHufflepuffStudent(Hufflepuff firstGryffindorStudent, Hufflepuff secGryffindorStudent) {
        int firstStudTotalPoints = firstGryffindorStudent.getHardworking() + firstGryffindorStudent.getLoyal() + firstGryffindorStudent.getHonest();
        int secStudTotalPoints = secGryffindorStudent.getHardworking() + secGryffindorStudent.getLoyal() + secGryffindorStudent.getHonest();

        String bestSt = (firstStudTotalPoints > secStudTotalPoints) ? firstGryffindorStudent.getName() : secGryffindorStudent.getName();
        System.out.println(bestSt + " лучший Пуфендуец");
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return super.toString() + " Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}
