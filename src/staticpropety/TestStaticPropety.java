package staticpropety;

public class TestStaticPropety {
    public static void main(String[] args) {
        Car car1 = new Car("City", "vtec-1");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Civic", "vtec-2");
        System.out.println(Car.numberOfCars);
    }
}
