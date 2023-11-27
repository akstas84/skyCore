package sky.core.org.app.transports;

import sky.core.org.app.*;

public class Car extends WheeledTransport implements CheckEngine {

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
