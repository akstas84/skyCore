package sky.core.org.app.transports;

import sky.core.org.app.*;

public class Car extends EngineTransport implements CheckEngine {

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }

}
