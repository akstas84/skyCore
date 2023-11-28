package sky.core.org.app.transports;

import sky.core.org.app.WheeledTransport;

public class Bicycle extends WheeledTransport {

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void service() {
        super.service();
    }

}
