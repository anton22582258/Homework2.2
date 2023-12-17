public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("bicycle1");
        Bicycle bicycle2 = new Bicycle("bicycle2");
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Transport [] transports = new Transport [] { bicycle, car, truck };
        for ( Transport transport : transports ) {
            transport.check ();
        }
       }
}
