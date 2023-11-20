package org.sky.core.students;

import org.sky.core.faculties.Gryffindor;

public class RonWeasley extends Gryffindor {

    public RonWeasley(int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(magicPower, transgressionDistance, nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return "Имя: Ron Weasley" + super.toString();
    }
}
