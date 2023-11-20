package org.sky.core.students;

import org.sky.core.faculties.Hufflepuff;

public class JustinFinchFletchley extends Hufflepuff {
    public JustinFinchFletchley(int hardworking, int loyal, int honest) {
        super(hardworking, loyal, honest);
    }

    @Override
    public String toString() {
        return "Имя: Justin Finch Fletchley" + super.toString();
    }
}
