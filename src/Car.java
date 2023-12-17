public class Car extends Transport {

    public int wheelsCount = 4;

       public void checkEngine() {
            System.out.println("Проверяем двигатель");
        }

    public Car (String modelName, int wheelsCount) {
        super(modelName, 4);
    }


    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}


