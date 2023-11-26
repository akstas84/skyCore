package sky.core.org.app.services;

import sky.core.org.app.trasports.ground.Bicycle;
import sky.core.org.app.trasports.ground.Car;
import sky.core.org.app.trasports.ground.Truck;

public interface Service {
    void check(Car car, Bicycle bicycle, Truck truck);
}
