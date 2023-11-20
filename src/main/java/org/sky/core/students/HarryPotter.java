package org.sky.core.students;

import org.sky.core.faculties.Gryffindor;

public class HarryPotter extends Gryffindor {

    public HarryPotter(int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance, nobility, honor, bravery);
        this.name = "Harry Potter";
    }

    @Override
    public String toString() {
        return "Имя:" + getName() + super.toString();
    }
}
