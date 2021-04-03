package Factory.Factory;

public class Test {
    public static void main(String[] args) {
        Car car1 = new TeslaFactory().getCar();
        car1.name();
        new NIOFactory().getCar().name();
    }
}
