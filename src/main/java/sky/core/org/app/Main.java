package sky.core.org.app;

import sky.core.org.app.services.Service;
import sky.core.org.app.services.ServiceStation;
import sky.core.org.app.transports.Bicycle;
import sky.core.org.app.transports.Car;
import sky.core.org.app.transports.Truck;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("car1", 4);
        Transport truck = new Truck("truck1", 4);

        Transport bicycle1 = new Bicycle("bicycle1", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 3);

        Transport[] transportsArr = {car, truck};

        Service station = new ServiceStation();
        for (Transport transport : transportsArr) {
            station.check(transport);
        }

        Transport[] transportBicycleArr = {bicycle1, bicycle2};
        ServiceStation stationBicycle = new ServiceStation();
        for (Transport bicycle : transportBicycleArr) {
            stationBicycle.check(bicycle);
        }
    }
}
