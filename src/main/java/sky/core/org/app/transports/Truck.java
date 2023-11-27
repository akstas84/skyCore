package sky.core.org.app.transports;

import sky.core.org.app.*;

public class Truck extends WheeledTransport implements CheckEngine, CheckTrailer {

    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
        checkTrailer();
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
