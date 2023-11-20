package org.sky.core.students;

import org.sky.core.faculties.Ravenclaw;

public class ZhouChang extends Ravenclaw {
    public ZhouChang(int smart, int wise, int witty, int creative) {
        super(smart, wise, witty, creative);
    }

    @Override
    public String toString() {
        return "Имя: Zhou Chang" + super.toString();
    }
}
