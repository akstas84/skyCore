package sky.core.org.app.trasports;

import sky.core.org.app.services.ServiceStation;

public class GroundTransportation extends ServiceStation implements Transportation {

    private String modelName;
    private int wheelsCount;

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {

    }

    public void setModelName(String setModelName) {
        this.modelName = setModelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
