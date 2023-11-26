package sky.core.org.app.trasports;

import sky.core.org.app.Cycle;
import sky.core.org.app.Transport;

public class Bicycle extends Cycle {

    public Bicycle(String bicycle1, int i) {
        super();
    }

    public void service(Transport bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }

    @Override
    public String getModelName() {
        return null;
    }

    @Override
    public int getWheelsCount() {
        return 0;
    }

    @Override
    public void updateTyre() {

    }
}
