package sky.core.org.app.transports;

import sky.core.org.app.*;

public class Truck extends EngineTransport implements CheckEngine, CheckTrailer {

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

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
