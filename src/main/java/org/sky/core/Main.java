package org.sky.core;

import org.sky.core.faculties.Gryffindor;

public class Main {

    public static void main(String[] args) {
        Hogwarts harryPotter = new Hogwarts("Harry Potter", 2, 3);
        Hogwarts dracoMalfoy = new Hogwarts("Draco Malfoy", 1, 1);
        dracoMalfoy.comparesPowerMagicAndDistanceTransgression(harryPotter);

        Gryffindor harryPotterGr = new Gryffindor("Harry Potter", 1,1,2, 5, 6);
        Gryffindor shmiginShpikenGr = new Gryffindor("Sh sSh", 1,1,2, 5, 10);
        harryPotterGr.getBestGryffindorStudent(shmiginShpikenGr);
    }
}
