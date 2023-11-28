package sky.core.org.app;

public abstract class EngineTransport extends WheeledTransport implements CheckEngine {

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
