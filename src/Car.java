public class Car extends Transport implements UpdateTyre, CheckEngine {

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}


