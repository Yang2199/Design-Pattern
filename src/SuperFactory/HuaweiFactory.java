package SuperFactory;

public class HuaweiFactory implements AbstractFactory{

    @Override
    public Phone phone() {
        return new HuaweiPhone();
    }

    @Override
    public Router router() {
        return new HuaweiRouter();
    }
}
