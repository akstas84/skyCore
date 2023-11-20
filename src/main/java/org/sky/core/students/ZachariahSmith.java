package org.sky.core.students;

import org.sky.core.faculties.Hufflepuff;

public class ZachariahSmith extends Hufflepuff {
    public ZachariahSmith(int hardworking, int loyal, int honest) {
        super(hardworking, loyal, honest);
    }

    @Override
    public String toString() {
        return "Имя: Zachariah Smith" + super.toString();
    }
}
