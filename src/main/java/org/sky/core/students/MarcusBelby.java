package org.sky.core.students;

import org.sky.core.faculties.Ravenclaw;

public class MarcusBelby extends Ravenclaw {
    public MarcusBelby(int smart, int wise, int witty, int creative) {
        super(smart, wise, witty, creative);
    }

    @Override
    public String toString() {
        return "Имя: Marcus Belby" + super.toString();
    }
}
