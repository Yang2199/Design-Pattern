package Factory.Factory;

public class NIOFactory implements Factory {
    @Override
    public Car getCar() {
        return new NIO();
    }
}
