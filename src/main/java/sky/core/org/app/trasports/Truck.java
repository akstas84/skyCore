package sky.core.org.app.trasports;

import sky.core.org.app.Transport;
import sky.core.org.app.Vehicle;

public class Truck extends Vehicle {

    public Truck(String truck1, int i) {
        super();
    }

    public void service(Transport truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
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
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
