package org.sky.core.students;

import org.sky.core.faculties.Slytherin;

public class GrahamMontague extends Slytherin {
    public GrahamMontague(int cunning, int determination, int ambition, int resourcefulness, int thirstPower) {
        super(cunning, determination, ambition, resourcefulness, thirstPower);
    }

    @Override
    public String toString() {
        return "Имя: Graham Montague" + super.toString();
    }
}
