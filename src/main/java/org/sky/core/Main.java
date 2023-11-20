package org.sky.core;

import org.sky.core.faculties.Gryffindor;
import org.sky.core.students.HarryPotter;
import org.sky.core.students.HermioneGranger;

public class Main {

    public static void main(String[] args) {
        Hogwarts hogwarts = new Hogwarts();
        Gryffindor gryffindor = new Gryffindor();
        HarryPotter harryPotter = new HarryPotter(4,1,1, 2, 3);
        HermioneGranger hermioneGranger = new HermioneGranger(1, 1, 1, 1, 1);
        gryffindor.getBestGryffindorStudent(harryPotter, hermioneGranger);
        hogwarts.comparesPowerMagicAndDistanceTransgression(harryPotter, hermioneGranger);
    }
}
