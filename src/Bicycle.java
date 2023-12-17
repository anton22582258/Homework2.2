public class Bicycle extends Transport {
    public static final Integer wheels = 2;

    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    @Override
    public void check () {
        updateTyre();
    }
}



