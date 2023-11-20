package org.sky.core.students;

import org.sky.core.faculties.Slytherin;

public class DracoMalfoy extends Slytherin {
    public DracoMalfoy(int cunning, int determination, int ambition, int resourcefulness, int thirstPower) {
        super(cunning, determination, ambition, resourcefulness, thirstPower);
    }

    @Override
    public String toString() {
        return "Имя: Draco Malfoy" + super.toString();
    }
}
