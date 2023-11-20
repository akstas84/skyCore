package org.sky.core.students;

import org.sky.core.faculties.Ravenclaw;

public class PadmaPatil extends Ravenclaw {
    public PadmaPatil(int smart, int wise, int witty, int creative) {
        super(smart, wise, witty, creative);
    }

    @Override
    public String toString() {
        return "Имя: Padma Patil" + super.toString();
    }
}
