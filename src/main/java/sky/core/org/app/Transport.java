package sky.core.org.app;

public interface Transport extends HumanPoweredTransport {

    void service();

    void checkEngine();

    void checkTrailer();
}
