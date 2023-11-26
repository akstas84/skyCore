package sky.core.org.app;

import sky.core.org.app.Transport;

public abstract class Bike implements Transport {
    public String modelName;
    public int wheelsCount;

    @Override
    public void checkEngine(){}

    @Override
    public void checkTrailer(){}

}
