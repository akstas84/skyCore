package sky.core.org.app;

public interface Transport {

    void service(Transport transport);

    void updateTyre();

    void checkEngine();

    void checkTrailer();

    int getWheelsCount();

    String getModelName();
}
