package org.sky.core;

public class Main {

    public static void main(String[] args) {
        Hogwarts harryPotter = new Hogwarts("Harry Potter", 2, 3);
        Hogwarts dracoMalfoy = new Hogwarts("Draco Malfoy", 1, 1);
        dracoMalfoy.comparesPowerMagicAndDistanceTransgression(harryPotter);

        harryPotter.getBestGryffindorStudent(dracoMalfoy);
    }
}
