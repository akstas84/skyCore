package sky.core.org.app;

public abstract class Vehicle implements Transport {
    public String modelName;
    public int wheelsCount;

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
