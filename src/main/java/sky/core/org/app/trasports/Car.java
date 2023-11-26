package sky.core.org.app.trasports;

import sky.core.org.app.Transport;
import sky.core.org.app.Vehicle;

public class Car extends Vehicle {


    public Car(String car1, int i) {
        super();
    }

    public void service(Transport car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
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

    @Override
    public void service() {

    }

    @Override
    public void checkEngine() {

    }

    @Override
    public void checkTrailer() {

    }
}
