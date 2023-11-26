package sky.core.org.app;

import sky.core.org.app.services.ServiceStation;
import sky.core.org.app.trasports.Bicycle;
import sky.core.org.app.trasports.Car;
import sky.core.org.app.trasports.Truck;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("car1", 4);
        Transport truck = new Truck("truck1", 4);
        HumanPoweredTransport bicycle = new Bicycle("bicycle1", 2);

        Transport[] transportsArr = {car, truck};

        ServiceStation station = new ServiceStation();
        for (Transport transport : transportsArr) {
            station.check(transport);
        }
    }
}
