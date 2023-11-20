package org.sky.core.students;

import org.sky.core.faculties.Hufflepuff;

public class CedricDiggory extends Hufflepuff {

    public CedricDiggory(int hardworking, int loyal, int honest) {
        super(hardworking, loyal, honest);
    }

    @Override
    public String toString() {
        return "Имя: Cedric Diggory" + super.toString();
    }
}
