package org.sky.core.students;

import org.sky.core.faculties.Gryffindor;

public class HermioneGranger extends Gryffindor {

    public HermioneGranger(int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance, nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return "Имя: Hermione Granger" + super.toString();
    }
}
